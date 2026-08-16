package br.edu.ifsp.aula.controller;

import br.edu.ifsp.aula.model.Aluno;
import br.edu.ifsp.aula.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("alunos", repository.findAll());
        model.addAttribute("novoAluno", new Aluno());
        return "index";
    }


    @GetMapping("/buscarPorProntuario/{prontuario}")
    public String buscarPorProntuario(Model model, @PathVariable(name="prontuario") String prontuario) {
        Aluno aluno = repository.findFirstByProntuarioIgnoreCase(prontuario);

        if (aluno != null){
            model.addAttribute("aluno",aluno);
            return "info_aluno";
        }
        model.addAttribute("mensagem", "ID inválido :(");
        return "erro";
    }
    @PostMapping("/adicionar")
    public String adicionar(@ModelAttribute Aluno aluno) {
        repository.save(aluno);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editarPagina(Model model, @PathVariable(name = "id") Long id) {
        Optional<Aluno> aluno = repository.findById(id);
        if (aluno.isPresent()){
            System.out.println("ACHOU ALUNO YAYYY");
            System.out.println(aluno);
            model.addAttribute("aluno",aluno.get());
        }
        else {
            System.out.println("Não tem aluno");
            model.addAttribute("mensagem", "ID inválido :(");
            return "erro";
        }

        return "editar";
    }

    @PostMapping("/editar/{id}")
    public String editar(@ModelAttribute Aluno aluno, @PathVariable(name = "id") Long id) {
        //repository.
        Aluno existente = repository.findById(id)
                .orElseThrow();
        existente.setNome(aluno.getNome());
        existente.setProntuario(aluno.getProntuario());
        existente.setCurso(aluno.getCurso());

        repository.save(existente);

        return "redirect:/";
    }

    @GetMapping("/deletar/{id}")
    public String remover(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }
}

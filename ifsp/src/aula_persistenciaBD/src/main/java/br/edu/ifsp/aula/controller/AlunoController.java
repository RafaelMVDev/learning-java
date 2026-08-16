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


    @GetMapping("/buscarPorProntuario")
    public List<Aluno> buscarPorProntuario(String prontuario) {
        List<Aluno> aluno = repository.findByProntuarioContainingIgnoreCase(prontuario);
        return aluno;
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
            model.addAttribute("aluno",aluno);
        }

        return "editar";
    }

    @PostMapping("/editar/{id}")
    public String editar(@ModelAttribute Aluno aluno, String id) {
        //repository.
        System.out.println(aluno);
        return "editar";
    }

    @GetMapping("/deletar/{id}")
    public String remover(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }
}

package controller;

import entity.Pretendenti;
import jakarta.validation.Valid;
import model.PretendentUpdateRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.PretendentiRepository;
import service.PretendentiService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PretendentiController {
@Autowired
    PretendentiService pretendentiService;
@Autowired
    PretendentiRepository pretendentiRepository;

@PostMapping("/pretendent/post")
public void createPret(@RequestBody Pretendenti pretendenti){pretendentiService.save(pretendenti);}

@GetMapping("/pretendent")
     List<Pretendenti> getPretendenti(){
    return pretendentiService.getPretendenti();
    }

    @PutMapping("/pretendent/{id}")
    public Pretendenti updatePretendent(@PathVariable Integer idPretendent, @Valid @RequestBody PretendentUpdateRequestModel pretendentUpdateRequestModel){
     Pretendenti pretendent = pretendentiService.update(idPretendent, pretendentUpdateRequestModel);
     return pretendent;
    }

    @DeleteMapping("/pretendent/delete/{id}")
    public void deletePretendent(@PathVariable Integer id) {
        pretendentiService.trash(id);
    }
}




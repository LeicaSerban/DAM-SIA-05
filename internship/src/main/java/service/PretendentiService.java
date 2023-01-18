package service;

import entity.Pretendenti;
import jakarta.persistence.EntityNotFoundException;
import model.PretendentUpdateRequestModel;
import repository.PretendentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PretendentiService {
    @Autowired
    PretendentiRepository pretendentiRepository;

    public List<Pretendenti> getPretendenti() {
        return  pretendentiRepository.findAll();
    }

    public void save(Pretendenti pretendenti){
        pretendentiRepository.save(pretendenti);
    }

    public Pretendenti update(Integer idPretendent, PretendentUpdateRequestModel pretendentUpdateRequestModel) {
        Pretendenti pretendent = pretendentiRepository.findById(idPretendent).orElseThrow(EntityNotFoundException::new);

        pretendent.setNume(pretendentUpdateRequestModel.getNume());
        pretendent.setAge(pretendentUpdateRequestModel.getAge());
        pretendentiRepository.save(pretendent);
        return pretendent;
    }

    public void trash(Integer id) {
        pretendentiRepository.deleteById(id);
    }
}

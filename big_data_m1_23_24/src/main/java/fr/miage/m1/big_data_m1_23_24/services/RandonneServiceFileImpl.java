package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.repositories.FileRepository;
import org.springframework.stereotype.Service;
import fr.miage.m1.big_data_m1_23_24.entity.Randonne;

import java.util.List;

@Service
public class RandonneServiceFileImpl implements RandonneService {

    private final FileRepository fileRepository;

    public RandonneServiceFileImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public Randonne get(Long id) {
        Randonne randonne = (Randonne) fileRepository.load(Randonne.class);
        return randonne;
    }

    @Override
    public List<Randonne> getAll() {
        return null;
    }

    @Override
    public Randonne create(Randonne author) {
        fileRepository.save(author);
        return author;
    }

    @Override
    public Randonne edit(Randonne author) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}

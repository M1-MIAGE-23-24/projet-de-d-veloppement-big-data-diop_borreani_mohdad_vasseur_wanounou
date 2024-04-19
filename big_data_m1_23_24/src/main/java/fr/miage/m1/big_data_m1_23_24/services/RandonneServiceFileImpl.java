package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.repositories.FileRepository;
import org.springframework.stereotype.Service;
import fr.miage.m1.big_data_m1_23_24.entity.randonne;

import java.util.List;

@Service
public class RandonneServiceFileImpl implements RandonneService {

    private final FileRepository fileRepository;

    public RandonneServiceFileImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public randonne get(Long id) {
        randonne randonne = (randonne) fileRepository.load(randonne.class);
        return randonne;
    }

    @Override
    public List<randonne> getAll() {
        return null;
    }

    @Override
    public randonne create(randonne author) {
        fileRepository.save(author);
        return author;
    }

    @Override
    public randonne edit(randonne author) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}

package upeu.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.dao.PlanCarreraDao;
import upeu.entity.PlanCarrera;
import upeu.repository.PlanCarreraRepository;

@Component
public class PlanCarreraDaoImpl implements PlanCarreraDao{
	
	@Autowired
	private PlanCarreraRepository repository;
	@Override
	public PlanCarrera create(PlanCarrera a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public PlanCarrera update(PlanCarrera a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public Optional<PlanCarrera> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<PlanCarrera> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}

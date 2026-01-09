package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClienteService {
    @Override
    public Iterable<Cliente> findAll() {
        return null;
    }

    @Override
    public Cliente findById(Long id) {
        return null;
    }

    @Override
    public void insert(Cliente cliente) {

    }

    @Override
    public void update(Long id, Cliente cliente) {

    }

    @Override
    public void delete(Long id) {

    }
}

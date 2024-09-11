package com.example.demo.service;

import com.example.demo.model.WaitlistEntry;
import com.example.demo.repository.WaitlistEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaitlistEntryService {

    @Autowired
    private WaitlistEntryRepository repository;

    public WaitlistEntry saveEntry(WaitlistEntry entry) {
        return repository.save(entry);
    }
}

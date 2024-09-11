package com.example.demo.controller;

import com.example.demo.model.WaitlistEntry;
import com.example.demo.service.WaitlistEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/waitlist")
public class WaitlistEntryController {

    @Autowired
    private WaitlistEntryService service;

    @PostMapping("/join")
    public WaitlistEntry joinWaitlist(@RequestBody WaitlistEntry entry) {
        return service.saveEntry(entry);
    }
}

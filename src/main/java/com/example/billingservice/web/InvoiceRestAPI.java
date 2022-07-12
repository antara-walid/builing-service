package com.example.billingservice.web;

import com.example.billingservice.dto.InvoiceRequestDTO;
import com.example.billingservice.dto.InvoiceResponseDTO;
import com.example.billingservice.services.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class InvoiceRestAPI {
    private final InvoiceService invoiceService;


    public InvoiceRestAPI(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping(path = "/invoices/{id}")
    public InvoiceResponseDTO getInvoice(@PathVariable(name="id") String invoiceId)
    {
        return invoiceService.getInvoiceById(invoiceId);
    }

    @GetMapping("/invoices/{customerId}")
    public List<InvoiceResponseDTO> getInvoicesByCustomer(@PathVariable String customerId)
    {
        return invoiceService.invoicesByCustomerId(customerId);
    }

    @PostMapping(path ="/invoices")
    public InvoiceResponseDTO save(@RequestBody InvoiceRequestDTO invoiceRequestDTO)
    {
        return invoiceService.save(invoiceRequestDTO);
    }
}

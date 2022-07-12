package com.example.billingservice.services;

import com.example.billingservice.dto.InvoiceRequestDTO;
import com.example.billingservice.dto.InvoiceResponseDTO;

import java.util.List;

public interface InvoiceService {
    InvoiceResponseDTO save (InvoiceRequestDTO invoiceRequestDTO);
    InvoiceResponseDTO getInvoiceById(String invoiceId);
    List<InvoiceResponseDTO> invoicesByCustomerId(String customerId);
}

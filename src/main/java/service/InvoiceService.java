package service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dispatch.entity.Invoice;
import com.dispatch.entity.Response;
 

@Service
public interface InvoiceService {

	public Invoice saveInvoiceData(Invoice invoice);
 

	public Response getInvoiceData();
}

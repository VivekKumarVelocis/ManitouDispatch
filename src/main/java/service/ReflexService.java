
package service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dispatch.entity.Reflex;
import com.dispatch.entity.Response;
import com.dispatch.entity.ResponseModel;

@Service
public interface ReflexService {

	public Reflex saveReflexData(Reflex reflex);

	public Response getReflexData();
}

package imc.Avaliacao2.control;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import imc.Avaliacao2.dto.ImcDto;



@RestController
@RequestMapping("/altura")
public class ImcController {
	
	@GetMapping
	public ResponseEntity<ImcDto> calcular(@RequestParam double altura,double peso){
		return ResponseEntity.ok(new ImcDto(altura,peso));
	}
	
}

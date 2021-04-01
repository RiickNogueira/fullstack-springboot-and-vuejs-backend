package com.richardson.springbootapi.service.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.richardson.springbootapi.model.Usuario;
import com.richardson.springbootapi.resource.exception.FieldMessage;

public class UsuarioUpdateValidator implements ConstraintValidator<UsuarioUpdate, Usuario> {

	@Override
	public boolean isValid(Usuario obj, ConstraintValidatorContext context) {
		List<FieldMessage> erros = new ArrayList<>();

		if (obj.getSexo() != null && !obj.getSexo().equals("M") && !obj.getSexo().equals("F")) {
			erros.add(new FieldMessage("sexo", "Permitido apenas valores M ou F"));

		}

		for (

		FieldMessage e : erros) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}

		return erros.isEmpty();
	}

}

package com.empresa.service;
import java.util.List;
import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public Medicamento insertaActualiza(Medicamento obj);
	public void elimina(int id);
	public List<Medicamento> listaMedicamento();
	public Medicamento buscarxId(int id);

}

package ru.digitalsmile.fabric_engine.core.labour.operative;

import java.util.HashMap;
import java.util.Map;

import ru.digitalsmile.fabric_engine.core.structure.operations.OperationType;

public class Operative {
	private final Map<OperationType, Grade> qualification = new HashMap<OperationType, Grade>();

	private final OperativeType type;
	private double salary;
	private SalaryType salaryType;

	public Operative(OperativeType operativeType, OperationType operationType,
			Grade grade) {
		this.type = operativeType;
		qualification.put(operationType, grade);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public SalaryType getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(SalaryType salaryType) {
		this.salaryType = salaryType;
	}

	public OperativeType getType() {
		return type;
	}

	public Grade getGrade(OperationType operationType) {
		return qualification.get(operationType);
	}

	public Map<OperationType, Grade> getQualification() {
		return qualification;
	}

}

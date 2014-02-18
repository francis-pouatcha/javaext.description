package org.adorsys.javaext.format;

import java.math.BigDecimal;

public enum UnitOfMeasureMass {
	t(1000000),kg(1000),g(1),dg(0.1),cg(0.01),mg(0.001);
	
	private final BigDecimal factor;

	private UnitOfMeasureMass(double factor) {
		this.factor = new BigDecimal(factor);
	}

	public BigDecimal getFactor() {
		return factor;
	}
}

package org.adorsys.javaext.format;

import java.math.BigDecimal;

public enum UnitOfMeasureLength {
	km(1000),m(1),dm(0.1),cm(0.01),mm(0.001);
	
	private final BigDecimal factor;

	private UnitOfMeasureLength(double factor) {
		this.factor = new BigDecimal(factor);
	}

	public BigDecimal getFactor() {
		return factor;
	}
}

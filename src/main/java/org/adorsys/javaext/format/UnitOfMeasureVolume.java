package org.adorsys.javaext.format;

import java.math.BigDecimal;

public enum UnitOfMeasureVolume {
	l(1),dl(0.1),cl(0.01),ml(0.001);
	
	private final BigDecimal factor;

	private UnitOfMeasureVolume(double factor) {
		this.factor = new BigDecimal(factor);
	}

	public BigDecimal getFactor() {
		return factor;
	}
}

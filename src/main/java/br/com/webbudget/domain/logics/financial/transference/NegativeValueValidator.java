package br.com.webbudget.domain.logics.financial.transference;

import br.com.webbudget.domain.entities.financial.Transference;
import br.com.webbudget.domain.exceptions.BusinessLogicException;

import javax.enterprise.context.Dependent;

/**
 * Validate the transferred value inside the {@link Transference}
 *
 * @author Arthur Gregorio
 *
 * @version 1.0.0
 * @since 1.0.0, 06/10/2018
 */
@Dependent
public class NegativeValueValidator implements TransferenceSavingLogic {

    /**
     * {@inheritDoc}
     *
     * @param value
     */
    @Override
    public void run(Transference value) {
        if (value.getValue().signum() < 0) {
            throw new BusinessLogicException("error.transference.negative-value");
        }
    }
}

/*******************************************************************************
* Copyright (c) 2007 IBM Corporation.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*    Robert Fuhrer (rfuhrer@watson.ibm.com) - initial API and implementation

*******************************************************************************/

package org.eclipse.imp.analysis.reachingdefs;

public abstract class ConstraintTerm {
    public interface ITermProcessor {
	public void processTerm(ConstraintTerm term);
    }

    public boolean isComplexTerm() {
	return false;
    }

    public void recomputeEstimate(IEstimateEnvironment env) {
    }

    abstract public void processTerms(ITermProcessor processor);
}

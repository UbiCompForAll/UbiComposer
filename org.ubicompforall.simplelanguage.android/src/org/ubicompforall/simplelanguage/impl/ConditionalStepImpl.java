/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ubicompforall.simplelanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ubicompforall.simplelanguage.Condition;
import org.ubicompforall.simplelanguage.ConditionalStep;
import org.ubicompforall.simplelanguage.SimpleLanguagePackage;
import org.ubicompforall.simplelanguage.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ubicompforall.simplelanguage.impl.ConditionalStepImpl#getStepSequence <em>Step Sequence</em>}</li>
 *   <li>{@link org.ubicompforall.simplelanguage.impl.ConditionalStepImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalStepImpl extends StepImpl implements ConditionalStep {
	/**
	 * The cached value of the '{@link #getStepSequence() <em>Step Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> stepSequence;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleLanguagePackage.Literals.CONDITIONAL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStepSequence() {
		if (stepSequence == null) {
			stepSequence = new EObjectContainmentEList<Step>(Step.class, this, SimpleLanguagePackage.CONDITIONAL_STEP__STEP_SEQUENCE);
		}
		return stepSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, SimpleLanguagePackage.CONDITIONAL_STEP__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleLanguagePackage.CONDITIONAL_STEP__STEP_SEQUENCE:
				return ((InternalEList<?>)getStepSequence()).basicRemove(otherEnd, msgs);
			case SimpleLanguagePackage.CONDITIONAL_STEP__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleLanguagePackage.CONDITIONAL_STEP__STEP_SEQUENCE:
				return getStepSequence();
			case SimpleLanguagePackage.CONDITIONAL_STEP__CONDITIONS:
				return getConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleLanguagePackage.CONDITIONAL_STEP__STEP_SEQUENCE:
				getStepSequence().clear();
				getStepSequence().addAll((Collection<? extends Step>)newValue);
				return;
			case SimpleLanguagePackage.CONDITIONAL_STEP__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimpleLanguagePackage.CONDITIONAL_STEP__STEP_SEQUENCE:
				getStepSequence().clear();
				return;
			case SimpleLanguagePackage.CONDITIONAL_STEP__CONDITIONS:
				getConditions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimpleLanguagePackage.CONDITIONAL_STEP__STEP_SEQUENCE:
				return stepSequence != null && !stepSequence.isEmpty();
			case SimpleLanguagePackage.CONDITIONAL_STEP__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionalStepImpl

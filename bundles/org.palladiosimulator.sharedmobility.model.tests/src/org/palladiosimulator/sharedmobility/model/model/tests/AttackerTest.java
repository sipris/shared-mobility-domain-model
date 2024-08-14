/**
 */
package org.palladiosimulator.sharedmobility.model.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.sharedmobility.model.model.Attacker;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackerTest extends TestCase {

	/**
	 * The fixture for this Attacker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attacker fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttackerTest.class);
	}

	/**
	 * Constructs a new Attacker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Attacker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Attacker fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Attacker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attacker getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharedmobilityModelFactory.eINSTANCE.createAttacker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AttackerTest

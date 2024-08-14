/**
 */
package org.palladiosimulator.sharedmobility.model.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import org.palladiosimulator.sharedmobility.model.model.PublicAgency;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Public Agency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PublicAgencyTest extends TestCase {

	/**
	 * The fixture for this Public Agency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicAgency fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PublicAgencyTest.class);
	}

	/**
	 * Constructs a new Public Agency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicAgencyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Public Agency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PublicAgency fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Public Agency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicAgency getFixture() {
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
		setFixture(SharedmobilityModelFactory.eINSTANCE.createPublicAgency());
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

} //PublicAgencyTest

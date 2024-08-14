/**
 */
package org.palladiosimulator.sharedmobility.model.model.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.sharedmobility.model.model.CarpoolingProvider;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Carpooling Provider</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarpoolingProviderTest extends MobilityServiceProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CarpoolingProviderTest.class);
	}

	/**
	 * Constructs a new Carpooling Provider test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarpoolingProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Carpooling Provider test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CarpoolingProvider getFixture() {
		return (CarpoolingProvider)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharedmobilityModelFactory.eINSTANCE.createCarpoolingProvider());
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

} //CarpoolingProviderTest

/**
 */
package org.palladiosimulator.sharedmobility.model.model.tests;

import junit.textui.TestRunner;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelFactory;
import org.palladiosimulator.sharedmobility.model.model.TraficLight;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trafic Light</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraficLightTest extends RoadsideUnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TraficLightTest.class);
	}

	/**
	 * Constructs a new Trafic Light test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraficLightTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Trafic Light test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TraficLight getFixture() {
		return (TraficLight)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharedmobilityModelFactory.eINSTANCE.createTraficLight());
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

} //TraficLightTest

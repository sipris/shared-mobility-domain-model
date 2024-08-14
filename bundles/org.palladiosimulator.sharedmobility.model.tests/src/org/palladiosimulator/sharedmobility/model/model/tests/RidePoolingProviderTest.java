/**
 */
package org.palladiosimulator.sharedmobility.model.model.tests;

import junit.textui.TestRunner;
import org.palladiosimulator.sharedmobility.model.model.RidePoolingProvider;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ride Pooling Provider</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RidePoolingProviderTest extends MobilityServiceProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RidePoolingProviderTest.class);
	}

	/**
	 * Constructs a new Ride Pooling Provider test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RidePoolingProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ride Pooling Provider test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RidePoolingProvider getFixture() {
		return (RidePoolingProvider)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharedmobilityModelFactory.eINSTANCE.createRidePoolingProvider());
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

} //RidePoolingProviderTest

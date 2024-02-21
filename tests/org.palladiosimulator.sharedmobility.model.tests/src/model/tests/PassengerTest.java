/**
 */
package model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import model.Passenger;
import model.SharedMobilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PassengerTest extends TestCase {

	/**
	 * The fixture for this Passenger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Passenger fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PassengerTest.class);
	}

	/**
	 * Constructs a new Passenger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Passenger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Passenger fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Passenger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Passenger getFixture() {
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
		setFixture(SharedMobilityFactory.eINSTANCE.createPassenger());
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

} //PassengerTest

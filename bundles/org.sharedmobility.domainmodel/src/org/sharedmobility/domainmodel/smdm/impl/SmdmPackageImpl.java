/**
 */
package org.sharedmobility.domainmodel.smdm.impl;

import identifier.IdentifierPackage;
import identifier.impl.IdentifierPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.sharedmobility.domainmodel.smdm.Domain;
import org.sharedmobility.domainmodel.smdm.SmdmFactory;
import org.sharedmobility.domainmodel.smdm.SmdmPackage;
import org.sharedmobility.domainmodel.smdm.communication.CommunicationPackage;
import org.sharedmobility.domainmodel.smdm.communication.impl.CommunicationPackageImpl;
import org.sharedmobility.domainmodel.smdm.metamodel.MetamodelPackage;
import org.sharedmobility.domainmodel.smdm.metamodel.impl.MetamodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmdmPackageImpl extends EPackageImpl implements SmdmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.sharedmobility.domainmodel.smdm.SmdmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmdmPackageImpl() {
		super(eNS_URI, SmdmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SmdmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmdmPackage init() {
		if (isInited)
			return (SmdmPackage) EPackage.Registry.INSTANCE.getEPackage(SmdmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSmdmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SmdmPackageImpl theSmdmPackage = registeredSmdmPackage instanceof SmdmPackageImpl
				? (SmdmPackageImpl) registeredSmdmPackage
				: new SmdmPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl) (registeredPackage instanceof CommunicationPackageImpl
				? registeredPackage
				: CommunicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetamodelPackage.eNS_URI);
		MetamodelPackageImpl theMetamodelPackage = (MetamodelPackageImpl) (registeredPackage instanceof MetamodelPackageImpl
				? registeredPackage
				: MetamodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		IdentifierPackageImpl theIdentifierPackage = (IdentifierPackageImpl) (registeredPackage instanceof IdentifierPackageImpl
				? registeredPackage
				: IdentifierPackage.eINSTANCE);

		// Create package meta-data objects
		theSmdmPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theMetamodelPackage.createPackageContents();
		theIdentifierPackage.createPackageContents();

		// Initialize created meta-data
		theSmdmPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theMetamodelPackage.initializePackageContents();
		theIdentifierPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmdmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmdmPackage.eNS_URI, theSmdmPackage);
		return theSmdmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Participant() {
		return (EReference) domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmdmFactory getSmdmFactory() {
		return (SmdmFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__PARTICIPANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommunicationPackage theCommunicationPackage = (CommunicationPackage) EPackage.Registry.INSTANCE
				.getEPackage(CommunicationPackage.eNS_URI);
		MetamodelPackage theMetamodelPackage = (MetamodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(MetamodelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCommunicationPackage);
		getESubpackages().add(theMetamodelPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Participant(), theMetamodelPackage.getParticipant(), null, "participant", null, 0, -1,
				Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SmdmPackageImpl

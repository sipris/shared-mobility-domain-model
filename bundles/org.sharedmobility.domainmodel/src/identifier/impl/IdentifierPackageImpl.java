/**
 */
package identifier.impl;

import identifier.Entity;
import identifier.Identifier;
import identifier.IdentifierFactory;
import identifier.IdentifierPackage;
import identifier.NamedElement;

import identifier.util.IdentifierValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.sharedmobility.domainmodel.smdm.SmdmPackage;

import org.sharedmobility.domainmodel.smdm.communication.CommunicationPackage;

import org.sharedmobility.domainmodel.smdm.communication.impl.CommunicationPackageImpl;

import org.sharedmobility.domainmodel.smdm.impl.SmdmPackageImpl;

import org.sharedmobility.domainmodel.smdm.metamodel.MetamodelPackage;

import org.sharedmobility.domainmodel.smdm.metamodel.impl.MetamodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifierPackageImpl extends EPackageImpl implements IdentifierPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

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
	 * @see identifier.IdentifierPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdentifierPackageImpl() {
		super(eNS_URI, IdentifierFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IdentifierPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdentifierPackage init() {
		if (isInited)
			return (IdentifierPackage) EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIdentifierPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IdentifierPackageImpl theIdentifierPackage = registeredIdentifierPackage instanceof IdentifierPackageImpl
				? (IdentifierPackageImpl) registeredIdentifierPackage
				: new IdentifierPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SmdmPackage.eNS_URI);
		SmdmPackageImpl theSmdmPackage = (SmdmPackageImpl) (registeredPackage instanceof SmdmPackageImpl
				? registeredPackage
				: SmdmPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl) (registeredPackage instanceof CommunicationPackageImpl
				? registeredPackage
				: CommunicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetamodelPackage.eNS_URI);
		MetamodelPackageImpl theMetamodelPackage = (MetamodelPackageImpl) (registeredPackage instanceof MetamodelPackageImpl
				? registeredPackage
				: MetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theIdentifierPackage.createPackageContents();
		theSmdmPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theIdentifierPackage.initializePackageContents();
		theSmdmPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theMetamodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theIdentifierPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return IdentifierValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theIdentifierPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdentifierPackage.eNS_URI, theIdentifierPackage);
		return theIdentifierPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Id() {
		return (EAttribute) identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_EntityName() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierFactory getIdentifierFactory() {
		return (IdentifierFactory) getEFactoryInstance();
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
		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__ID);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__ENTITY_NAME);

		entityEClass = createEClass(ENTITY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getIdentifier());
		entityEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifierEClass, Identifier.class, "Identifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_Id(), ecorePackage.getEString(), "id", null, 1, 1, Identifier.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_EntityName(), ecorePackage.getEString(), "entityName", "aName", 1, 1,
				NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(identifierEClass, source, new String[] { "constraints", "identifierIsUnique" });
	}

} //IdentifierPackageImpl

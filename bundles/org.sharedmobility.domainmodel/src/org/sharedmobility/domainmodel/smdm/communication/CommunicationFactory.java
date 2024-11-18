/**
 */
package org.sharedmobility.domainmodel.smdm.communication;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.sharedmobility.domainmodel.smdm.communication.CommunicationPackage
 * @generated
 */
public interface CommunicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationFactory eINSTANCE = org.sharedmobility.domainmodel.smdm.communication.impl.CommunicationFactoryImpl
			.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationPackage getCommunicationPackage();

} //CommunicationFactory
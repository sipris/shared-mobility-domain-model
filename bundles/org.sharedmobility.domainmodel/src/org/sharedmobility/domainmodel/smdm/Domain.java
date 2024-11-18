/**
 */
package org.sharedmobility.domainmodel.smdm;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.sharedmobility.domainmodel.smdm.metamodel.Participant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sharedmobility.domainmodel.smdm.Domain#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @see org.sharedmobility.domainmodel.smdm.SmdmPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.sharedmobility.domainmodel.smdm.metamodel.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.sharedmobility.domainmodel.smdm.SmdmPackage#getDomain_Participant()
	 * @model containment="true"
	 * @generated
	 */
	List<Participant> getParticipant();
} // Domain

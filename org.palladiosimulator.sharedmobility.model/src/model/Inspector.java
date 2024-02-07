/**
 */
package model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Inspector#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see model.SharedMobilityPackage#getInspector()
 * @model
 * @generated
 */
public interface Inspector extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see model.SharedMobilityPackage#getInspector_Id()
	 * @model id="true"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link model.Inspector#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

} // Inspector

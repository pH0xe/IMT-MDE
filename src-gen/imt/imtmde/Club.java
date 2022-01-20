/**
 */
package imt.imtmde;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Club</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.Club#getNom <em>Nom</em>}</li>
 *   <li>{@link imt.imtmde.Club#getTireur <em>Tireur</em>}</li>
 *   <li>{@link imt.imtmde.Club#getAdresse <em>Adresse</em>}</li>
 * </ul>
 *
 * @see imt.imtmde.ImtmdePackage#getClub()
 * @model
 * @generated
 */
public interface Club extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see imt.imtmde.ImtmdePackage#getClub_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link imt.imtmde.Club#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Tireur</b></em>' containment reference list.
	 * The list contents are of type {@link imt.imtmde.Tireur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tireur</em>' containment reference list.
	 * @see imt.imtmde.ImtmdePackage#getClub_Tireur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tireur> getTireur();

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' containment reference.
	 * @see #setAdresse(Adresse)
	 * @see imt.imtmde.ImtmdePackage#getClub_Adresse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Adresse getAdresse();

	/**
	 * Sets the value of the '{@link imt.imtmde.Club#getAdresse <em>Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' containment reference.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(Adresse value);

} // Club

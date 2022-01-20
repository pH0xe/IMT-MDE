/**
 */
package imt.imtmde;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adresse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.Adresse#getAdressePostale <em>Adresse Postale</em>}</li>
 *   <li>{@link imt.imtmde.Adresse#getCodePostal <em>Code Postal</em>}</li>
 *   <li>{@link imt.imtmde.Adresse#getVille <em>Ville</em>}</li>
 * </ul>
 *
 * @see imt.imtmde.ImtmdePackage#getAdresse()
 * @model
 * @generated
 */
public interface Adresse extends EObject {
	/**
	 * Returns the value of the '<em><b>Adresse Postale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse Postale</em>' attribute.
	 * @see #setAdressePostale(String)
	 * @see imt.imtmde.ImtmdePackage#getAdresse_AdressePostale()
	 * @model
	 * @generated
	 */
	String getAdressePostale();

	/**
	 * Sets the value of the '{@link imt.imtmde.Adresse#getAdressePostale <em>Adresse Postale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse Postale</em>' attribute.
	 * @see #getAdressePostale()
	 * @generated
	 */
	void setAdressePostale(String value);

	/**
	 * Returns the value of the '<em><b>Code Postal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Postal</em>' attribute.
	 * @see #setCodePostal(int)
	 * @see imt.imtmde.ImtmdePackage#getAdresse_CodePostal()
	 * @model
	 * @generated
	 */
	int getCodePostal();

	/**
	 * Sets the value of the '{@link imt.imtmde.Adresse#getCodePostal <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Postal</em>' attribute.
	 * @see #getCodePostal()
	 * @generated
	 */
	void setCodePostal(int value);

	/**
	 * Returns the value of the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ville</em>' attribute.
	 * @see #setVille(String)
	 * @see imt.imtmde.ImtmdePackage#getAdresse_Ville()
	 * @model
	 * @generated
	 */
	String getVille();

	/**
	 * Sets the value of the '{@link imt.imtmde.Adresse#getVille <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ville</em>' attribute.
	 * @see #getVille()
	 * @generated
	 */
	void setVille(String value);

} // Adresse

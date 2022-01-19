/**
 */
package imt.imtmde;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Competition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.Competition#getNom <em>Nom</em>}</li>
 *   <li>{@link imt.imtmde.Competition#getClub <em>Club</em>}</li>
 *   <li>{@link imt.imtmde.Competition#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link imt.imtmde.Competition#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see imt.imtmde.ImtmdePackage#getCompetition()
 * @model
 * @generated
 */
public interface Competition extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see imt.imtmde.ImtmdePackage#getCompetition_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link imt.imtmde.Competition#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Club</b></em>' containment reference list.
	 * The list contents are of type {@link imt.imtmde.Club}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Club</em>' containment reference list.
	 * @see imt.imtmde.ImtmdePackage#getCompetition_Club()
	 * @model containment="true"
	 * @generated
	 */
	EList<Club> getClub();

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' containment reference.
	 * @see #setAdresse(Adresse)
	 * @see imt.imtmde.ImtmdePackage#getCompetition_Adresse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Adresse getAdresse();

	/**
	 * Sets the value of the '{@link imt.imtmde.Competition#getAdresse <em>Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' containment reference.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(Adresse value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' containment reference list.
	 * The list contents are of type {@link imt.imtmde.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' containment reference list.
	 * @see imt.imtmde.ImtmdePackage#getCompetition_Match()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatch();

} // Competition

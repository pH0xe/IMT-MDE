/**
 */
package imt.imtmde;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tireur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.Tireur#getNom <em>Nom</em>}</li>
 *   <li>{@link imt.imtmde.Tireur#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link imt.imtmde.Tireur#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link imt.imtmde.Tireur#getSexe <em>Sexe</em>}</li>
 *   <li>{@link imt.imtmde.Tireur#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see imt.imtmde.ImtmdePackage#getTireur()
 * @model abstract="true"
 * @generated
 */
public interface Tireur extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see imt.imtmde.ImtmdePackage#getTireur_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link imt.imtmde.Tireur#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see imt.imtmde.ImtmdePackage#getTireur_Prenom()
	 * @model
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link imt.imtmde.Tireur#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link imt.imtmde.TypeCategorie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see imt.imtmde.TypeCategorie
	 * @see #setCategorie(TypeCategorie)
	 * @see imt.imtmde.ImtmdePackage#getTireur_Categorie()
	 * @model default=""
	 * @generated
	 */
	TypeCategorie getCategorie();

	/**
	 * Sets the value of the '{@link imt.imtmde.Tireur#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see imt.imtmde.TypeCategorie
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeCategorie value);

	/**
	 * Returns the value of the '<em><b>Sexe</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link imt.imtmde.TypeSexe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sexe</em>' attribute.
	 * @see imt.imtmde.TypeSexe
	 * @see #setSexe(TypeSexe)
	 * @see imt.imtmde.ImtmdePackage#getTireur_Sexe()
	 * @model default=""
	 * @generated
	 */
	TypeSexe getSexe();

	/**
	 * Sets the value of the '{@link imt.imtmde.Tireur#getSexe <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sexe</em>' attribute.
	 * @see imt.imtmde.TypeSexe
	 * @see #getSexe()
	 * @generated
	 */
	void setSexe(TypeSexe value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' reference list.
	 * The list contents are of type {@link imt.imtmde.Match}.
	 * It is bidirectional and its opposite is '{@link imt.imtmde.Match#getTireurs <em>Tireurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference list.
	 * @see imt.imtmde.ImtmdePackage#getTireur_Match()
	 * @see imt.imtmde.Match#getTireurs
	 * @model opposite="tireurs"
	 * @generated
	 */
	EList<Match> getMatch();

} // Tireur

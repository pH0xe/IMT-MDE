/**
 */
package imt.imtmde;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.Match#getArme <em>Arme</em>}</li>
 *   <li>{@link imt.imtmde.Match#getSexe <em>Sexe</em>}</li>
 *   <li>{@link imt.imtmde.Match#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link imt.imtmde.Match#getResultat <em>Resultat</em>}</li>
 *   <li>{@link imt.imtmde.Match#getTireurs <em>Tireurs</em>}</li>
 * </ul>
 *
 * @see imt.imtmde.ImtmdePackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Arme</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link imt.imtmde.TypeArme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arme</em>' attribute.
	 * @see imt.imtmde.TypeArme
	 * @see #setArme(TypeArme)
	 * @see imt.imtmde.ImtmdePackage#getMatch_Arme()
	 * @model default=""
	 * @generated
	 */
	TypeArme getArme();

	/**
	 * Sets the value of the '{@link imt.imtmde.Match#getArme <em>Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arme</em>' attribute.
	 * @see imt.imtmde.TypeArme
	 * @see #getArme()
	 * @generated
	 */
	void setArme(TypeArme value);

	/**
	 * Returns the value of the '<em><b>Sexe</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link imt.imtmde.TypeSexe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sexe</em>' attribute.
	 * @see imt.imtmde.TypeSexe
	 * @see #setSexe(TypeSexe)
	 * @see imt.imtmde.ImtmdePackage#getMatch_Sexe()
	 * @model default=""
	 * @generated
	 */
	TypeSexe getSexe();

	/**
	 * Sets the value of the '{@link imt.imtmde.Match#getSexe <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sexe</em>' attribute.
	 * @see imt.imtmde.TypeSexe
	 * @see #getSexe()
	 * @generated
	 */
	void setSexe(TypeSexe value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link imt.imtmde.TypeCategorie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see imt.imtmde.TypeCategorie
	 * @see #setCategorie(TypeCategorie)
	 * @see imt.imtmde.ImtmdePackage#getMatch_Categorie()
	 * @model default=""
	 * @generated
	 */
	TypeCategorie getCategorie();

	/**
	 * Sets the value of the '{@link imt.imtmde.Match#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see imt.imtmde.TypeCategorie
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeCategorie value);

	/**
	 * Returns the value of the '<em><b>Resultat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultat</em>' containment reference.
	 * @see #setResultat(Resultat)
	 * @see imt.imtmde.ImtmdePackage#getMatch_Resultat()
	 * @model containment="true"
	 * @generated
	 */
	Resultat getResultat();

	/**
	 * Sets the value of the '{@link imt.imtmde.Match#getResultat <em>Resultat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultat</em>' containment reference.
	 * @see #getResultat()
	 * @generated
	 */
	void setResultat(Resultat value);

	/**
	 * Returns the value of the '<em><b>Tireurs</b></em>' reference list.
	 * The list contents are of type {@link imt.imtmde.Tireur}.
	 * It is bidirectional and its opposite is '{@link imt.imtmde.Tireur#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tireurs</em>' reference list.
	 * @see imt.imtmde.ImtmdePackage#getMatch_Tireurs()
	 * @see imt.imtmde.Tireur#getMatch
	 * @model opposite="match" lower="2" upper="2"
	 * @generated
	 */
	EList<Tireur> getTireurs();

} // Match

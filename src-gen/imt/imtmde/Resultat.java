/**
 */
package imt.imtmde;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resultat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.Resultat#getScore <em>Score</em>}</li>
 *   <li>{@link imt.imtmde.Resultat#getTemps <em>Temps</em>}</li>
 * </ul>
 *
 * @see imt.imtmde.ImtmdePackage#getResultat()
 * @model
 * @generated
 */
public interface Resultat extends EObject {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(String)
	 * @see imt.imtmde.ImtmdePackage#getResultat_Score()
	 * @model
	 * @generated
	 */
	String getScore();

	/**
	 * Sets the value of the '{@link imt.imtmde.Resultat#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(String value);

	/**
	 * Returns the value of the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps</em>' attribute.
	 * @see #setTemps(int)
	 * @see imt.imtmde.ImtmdePackage#getResultat_Temps()
	 * @model
	 * @generated
	 */
	int getTemps();

	/**
	 * Sets the value of the '{@link imt.imtmde.Resultat#getTemps <em>Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps</em>' attribute.
	 * @see #getTemps()
	 * @generated
	 */
	void setTemps(int value);

} // Resultat

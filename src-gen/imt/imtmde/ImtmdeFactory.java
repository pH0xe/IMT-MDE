/**
 */
package imt.imtmde;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see imt.imtmde.ImtmdePackage
 * @generated
 */
public interface ImtmdeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImtmdeFactory eINSTANCE = imt.imtmde.impl.ImtmdeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adresse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adresse</em>'.
	 * @generated
	 */
	Adresse createAdresse();

	/**
	 * Returns a new object of class '<em>Competition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Competition</em>'.
	 * @generated
	 */
	Competition createCompetition();

	/**
	 * Returns a new object of class '<em>Club</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Club</em>'.
	 * @generated
	 */
	Club createClub();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns a new object of class '<em>Resultat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resultat</em>'.
	 * @generated
	 */
	Resultat createResultat();

	/**
	 * Returns a new object of class '<em>Fleurettiste</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fleurettiste</em>'.
	 * @generated
	 */
	Fleurettiste createFleurettiste();

	/**
	 * Returns a new object of class '<em>Epeiste</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Epeiste</em>'.
	 * @generated
	 */
	Epeiste createEpeiste();

	/**
	 * Returns a new object of class '<em>Sabreur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sabreur</em>'.
	 * @generated
	 */
	Sabreur createSabreur();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImtmdePackage getImtmdePackage();

} //ImtmdeFactory

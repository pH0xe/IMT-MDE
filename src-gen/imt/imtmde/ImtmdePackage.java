/**
 */
package imt.imtmde;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see imt.imtmde.ImtmdeFactory
 * @model kind="package"
 * @generated
 */
public interface ImtmdePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imtmde";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/imtmde";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imtmde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImtmdePackage eINSTANCE = imt.imtmde.impl.ImtmdePackageImpl.init();

	/**
	 * The meta object id for the '{@link imt.imtmde.impl.AdresseImpl <em>Adresse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.impl.AdresseImpl
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getAdresse()
	 * @generated
	 */
	int ADRESSE = 0;

	/**
	 * The feature id for the '<em><b>Adresse Postale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE__ADRESSE_POSTALE = 0;

	/**
	 * The feature id for the '<em><b>Code Postal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE__CODE_POSTAL = 1;

	/**
	 * The feature id for the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE__VILLE = 2;

	/**
	 * The number of structural features of the '<em>Adresse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Adresse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imt.imtmde.impl.CompetitionImpl <em>Competition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.impl.CompetitionImpl
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getCompetition()
	 * @generated
	 */
	int COMPETITION = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__NOM = 0;

	/**
	 * The feature id for the '<em><b>Club</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__CLUB = 1;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Match</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION__MATCH = 3;

	/**
	 * The number of structural features of the '<em>Competition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Competition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPETITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imt.imtmde.impl.ClubImpl <em>Club</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.impl.ClubImpl
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getClub()
	 * @generated
	 */
	int CLUB = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUB__NOM = 0;

	/**
	 * The feature id for the '<em><b>Tireur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUB__TIREUR = 1;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUB__ADRESSE = 2;

	/**
	 * The number of structural features of the '<em>Club</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Club</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imt.imtmde.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.impl.MatchImpl
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 3;

	/**
	 * The feature id for the '<em><b>Arme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ARME = 0;

	/**
	 * The feature id for the '<em><b>Sexe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SEXE = 1;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__CATEGORIE = 2;

	/**
	 * The feature id for the '<em><b>Resultat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__RESULTAT = 3;

	/**
	 * The feature id for the '<em><b>Tireurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TIREURS = 4;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imt.imtmde.impl.ResultatImpl <em>Resultat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.impl.ResultatImpl
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getResultat()
	 * @generated
	 */
	int RESULTAT = 4;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT__SCORE = 0;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT__TEMPS = 1;

	/**
	 * The number of structural features of the '<em>Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imt.imtmde.impl.TireurImpl <em>Tireur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.impl.TireurImpl
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getTireur()
	 * @generated
	 */
	int TIREUR = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIREUR__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIREUR__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIREUR__CATEGORIE = 2;

	/**
	 * The feature id for the '<em><b>Sexe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIREUR__SEXE = 3;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIREUR__MATCH = 4;

	/**
	 * The number of structural features of the '<em>Tireur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIREUR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Tireur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIREUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imt.imtmde.impl.FleurettisteImpl <em>Fleurettiste</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.impl.FleurettisteImpl
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getFleurettiste()
	 * @generated
	 */
	int FLEURETTISTE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEURETTISTE__NOM = TIREUR__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEURETTISTE__PRENOM = TIREUR__PRENOM;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEURETTISTE__CATEGORIE = TIREUR__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Sexe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEURETTISTE__SEXE = TIREUR__SEXE;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEURETTISTE__MATCH = TIREUR__MATCH;

	/**
	 * The number of structural features of the '<em>Fleurettiste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEURETTISTE_FEATURE_COUNT = TIREUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fleurettiste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEURETTISTE_OPERATION_COUNT = TIREUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imt.imtmde.impl.EpeisteImpl <em>Epeiste</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.impl.EpeisteImpl
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getEpeiste()
	 * @generated
	 */
	int EPEISTE = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPEISTE__NOM = TIREUR__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPEISTE__PRENOM = TIREUR__PRENOM;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPEISTE__CATEGORIE = TIREUR__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Sexe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPEISTE__SEXE = TIREUR__SEXE;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPEISTE__MATCH = TIREUR__MATCH;

	/**
	 * The number of structural features of the '<em>Epeiste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPEISTE_FEATURE_COUNT = TIREUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Epeiste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPEISTE_OPERATION_COUNT = TIREUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imt.imtmde.impl.SabreurImpl <em>Sabreur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.impl.SabreurImpl
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getSabreur()
	 * @generated
	 */
	int SABREUR = 8;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SABREUR__NOM = TIREUR__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SABREUR__PRENOM = TIREUR__PRENOM;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SABREUR__CATEGORIE = TIREUR__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Sexe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SABREUR__SEXE = TIREUR__SEXE;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SABREUR__MATCH = TIREUR__MATCH;

	/**
	 * The number of structural features of the '<em>Sabreur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SABREUR_FEATURE_COUNT = TIREUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sabreur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SABREUR_OPERATION_COUNT = TIREUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imt.imtmde.TypeArme <em>Type Arme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.TypeArme
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getTypeArme()
	 * @generated
	 */
	int TYPE_ARME = 9;

	/**
	 * The meta object id for the '{@link imt.imtmde.TypeSexe <em>Type Sexe</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.TypeSexe
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getTypeSexe()
	 * @generated
	 */
	int TYPE_SEXE = 10;

	/**
	 * The meta object id for the '{@link imt.imtmde.TypeCategorie <em>Type Categorie</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imt.imtmde.TypeCategorie
	 * @see imt.imtmde.impl.ImtmdePackageImpl#getTypeCategorie()
	 * @generated
	 */
	int TYPE_CATEGORIE = 11;

	/**
	 * Returns the meta object for class '{@link imt.imtmde.Adresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adresse</em>'.
	 * @see imt.imtmde.Adresse
	 * @generated
	 */
	EClass getAdresse();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Adresse#getAdressePostale <em>Adresse Postale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse Postale</em>'.
	 * @see imt.imtmde.Adresse#getAdressePostale()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_AdressePostale();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Adresse#getCodePostal <em>Code Postal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Postal</em>'.
	 * @see imt.imtmde.Adresse#getCodePostal()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_CodePostal();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Adresse#getVille <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ville</em>'.
	 * @see imt.imtmde.Adresse#getVille()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_Ville();

	/**
	 * Returns the meta object for class '{@link imt.imtmde.Competition <em>Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Competition</em>'.
	 * @see imt.imtmde.Competition
	 * @generated
	 */
	EClass getCompetition();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Competition#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see imt.imtmde.Competition#getNom()
	 * @see #getCompetition()
	 * @generated
	 */
	EAttribute getCompetition_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link imt.imtmde.Competition#getClub <em>Club</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Club</em>'.
	 * @see imt.imtmde.Competition#getClub()
	 * @see #getCompetition()
	 * @generated
	 */
	EReference getCompetition_Club();

	/**
	 * Returns the meta object for the containment reference '{@link imt.imtmde.Competition#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresse</em>'.
	 * @see imt.imtmde.Competition#getAdresse()
	 * @see #getCompetition()
	 * @generated
	 */
	EReference getCompetition_Adresse();

	/**
	 * Returns the meta object for the containment reference list '{@link imt.imtmde.Competition#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Match</em>'.
	 * @see imt.imtmde.Competition#getMatch()
	 * @see #getCompetition()
	 * @generated
	 */
	EReference getCompetition_Match();

	/**
	 * Returns the meta object for class '{@link imt.imtmde.Club <em>Club</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Club</em>'.
	 * @see imt.imtmde.Club
	 * @generated
	 */
	EClass getClub();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Club#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see imt.imtmde.Club#getNom()
	 * @see #getClub()
	 * @generated
	 */
	EAttribute getClub_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link imt.imtmde.Club#getTireur <em>Tireur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tireur</em>'.
	 * @see imt.imtmde.Club#getTireur()
	 * @see #getClub()
	 * @generated
	 */
	EReference getClub_Tireur();

	/**
	 * Returns the meta object for the containment reference '{@link imt.imtmde.Club#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresse</em>'.
	 * @see imt.imtmde.Club#getAdresse()
	 * @see #getClub()
	 * @generated
	 */
	EReference getClub_Adresse();

	/**
	 * Returns the meta object for class '{@link imt.imtmde.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see imt.imtmde.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Match#getArme <em>Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arme</em>'.
	 * @see imt.imtmde.Match#getArme()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Arme();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Match#getSexe <em>Sexe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sexe</em>'.
	 * @see imt.imtmde.Match#getSexe()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Sexe();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Match#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see imt.imtmde.Match#getCategorie()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Categorie();

	/**
	 * Returns the meta object for the containment reference '{@link imt.imtmde.Match#getResultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resultat</em>'.
	 * @see imt.imtmde.Match#getResultat()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Resultat();

	/**
	 * Returns the meta object for the reference list '{@link imt.imtmde.Match#getTireurs <em>Tireurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tireurs</em>'.
	 * @see imt.imtmde.Match#getTireurs()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Tireurs();

	/**
	 * Returns the meta object for class '{@link imt.imtmde.Resultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resultat</em>'.
	 * @see imt.imtmde.Resultat
	 * @generated
	 */
	EClass getResultat();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Resultat#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see imt.imtmde.Resultat#getScore()
	 * @see #getResultat()
	 * @generated
	 */
	EAttribute getResultat_Score();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Resultat#getTemps <em>Temps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps</em>'.
	 * @see imt.imtmde.Resultat#getTemps()
	 * @see #getResultat()
	 * @generated
	 */
	EAttribute getResultat_Temps();

	/**
	 * Returns the meta object for class '{@link imt.imtmde.Tireur <em>Tireur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tireur</em>'.
	 * @see imt.imtmde.Tireur
	 * @generated
	 */
	EClass getTireur();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Tireur#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see imt.imtmde.Tireur#getNom()
	 * @see #getTireur()
	 * @generated
	 */
	EAttribute getTireur_Nom();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Tireur#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see imt.imtmde.Tireur#getPrenom()
	 * @see #getTireur()
	 * @generated
	 */
	EAttribute getTireur_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Tireur#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see imt.imtmde.Tireur#getCategorie()
	 * @see #getTireur()
	 * @generated
	 */
	EAttribute getTireur_Categorie();

	/**
	 * Returns the meta object for the attribute '{@link imt.imtmde.Tireur#getSexe <em>Sexe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sexe</em>'.
	 * @see imt.imtmde.Tireur#getSexe()
	 * @see #getTireur()
	 * @generated
	 */
	EAttribute getTireur_Sexe();

	/**
	 * Returns the meta object for the reference list '{@link imt.imtmde.Tireur#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Match</em>'.
	 * @see imt.imtmde.Tireur#getMatch()
	 * @see #getTireur()
	 * @generated
	 */
	EReference getTireur_Match();

	/**
	 * Returns the meta object for class '{@link imt.imtmde.Fleurettiste <em>Fleurettiste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fleurettiste</em>'.
	 * @see imt.imtmde.Fleurettiste
	 * @generated
	 */
	EClass getFleurettiste();

	/**
	 * Returns the meta object for class '{@link imt.imtmde.Epeiste <em>Epeiste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epeiste</em>'.
	 * @see imt.imtmde.Epeiste
	 * @generated
	 */
	EClass getEpeiste();

	/**
	 * Returns the meta object for class '{@link imt.imtmde.Sabreur <em>Sabreur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sabreur</em>'.
	 * @see imt.imtmde.Sabreur
	 * @generated
	 */
	EClass getSabreur();

	/**
	 * Returns the meta object for enum '{@link imt.imtmde.TypeArme <em>Type Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Arme</em>'.
	 * @see imt.imtmde.TypeArme
	 * @generated
	 */
	EEnum getTypeArme();

	/**
	 * Returns the meta object for enum '{@link imt.imtmde.TypeSexe <em>Type Sexe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Sexe</em>'.
	 * @see imt.imtmde.TypeSexe
	 * @generated
	 */
	EEnum getTypeSexe();

	/**
	 * Returns the meta object for enum '{@link imt.imtmde.TypeCategorie <em>Type Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Categorie</em>'.
	 * @see imt.imtmde.TypeCategorie
	 * @generated
	 */
	EEnum getTypeCategorie();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImtmdeFactory getImtmdeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link imt.imtmde.impl.AdresseImpl <em>Adresse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.impl.AdresseImpl
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getAdresse()
		 * @generated
		 */
		EClass ADRESSE = eINSTANCE.getAdresse();

		/**
		 * The meta object literal for the '<em><b>Adresse Postale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSE__ADRESSE_POSTALE = eINSTANCE.getAdresse_AdressePostale();

		/**
		 * The meta object literal for the '<em><b>Code Postal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSE__CODE_POSTAL = eINSTANCE.getAdresse_CodePostal();

		/**
		 * The meta object literal for the '<em><b>Ville</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSE__VILLE = eINSTANCE.getAdresse_Ville();

		/**
		 * The meta object literal for the '{@link imt.imtmde.impl.CompetitionImpl <em>Competition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.impl.CompetitionImpl
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getCompetition()
		 * @generated
		 */
		EClass COMPETITION = eINSTANCE.getCompetition();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPETITION__NOM = eINSTANCE.getCompetition_Nom();

		/**
		 * The meta object literal for the '<em><b>Club</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETITION__CLUB = eINSTANCE.getCompetition_Club();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETITION__ADRESSE = eINSTANCE.getCompetition_Adresse();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPETITION__MATCH = eINSTANCE.getCompetition_Match();

		/**
		 * The meta object literal for the '{@link imt.imtmde.impl.ClubImpl <em>Club</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.impl.ClubImpl
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getClub()
		 * @generated
		 */
		EClass CLUB = eINSTANCE.getClub();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUB__NOM = eINSTANCE.getClub_Nom();

		/**
		 * The meta object literal for the '<em><b>Tireur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUB__TIREUR = eINSTANCE.getClub_Tireur();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUB__ADRESSE = eINSTANCE.getClub_Adresse();

		/**
		 * The meta object literal for the '{@link imt.imtmde.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.impl.MatchImpl
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Arme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__ARME = eINSTANCE.getMatch_Arme();

		/**
		 * The meta object literal for the '<em><b>Sexe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__SEXE = eINSTANCE.getMatch_Sexe();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__CATEGORIE = eINSTANCE.getMatch_Categorie();

		/**
		 * The meta object literal for the '<em><b>Resultat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__RESULTAT = eINSTANCE.getMatch_Resultat();

		/**
		 * The meta object literal for the '<em><b>Tireurs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__TIREURS = eINSTANCE.getMatch_Tireurs();

		/**
		 * The meta object literal for the '{@link imt.imtmde.impl.ResultatImpl <em>Resultat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.impl.ResultatImpl
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getResultat()
		 * @generated
		 */
		EClass RESULTAT = eINSTANCE.getResultat();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTAT__SCORE = eINSTANCE.getResultat_Score();

		/**
		 * The meta object literal for the '<em><b>Temps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTAT__TEMPS = eINSTANCE.getResultat_Temps();

		/**
		 * The meta object literal for the '{@link imt.imtmde.impl.TireurImpl <em>Tireur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.impl.TireurImpl
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getTireur()
		 * @generated
		 */
		EClass TIREUR = eINSTANCE.getTireur();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIREUR__NOM = eINSTANCE.getTireur_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIREUR__PRENOM = eINSTANCE.getTireur_Prenom();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIREUR__CATEGORIE = eINSTANCE.getTireur_Categorie();

		/**
		 * The meta object literal for the '<em><b>Sexe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIREUR__SEXE = eINSTANCE.getTireur_Sexe();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIREUR__MATCH = eINSTANCE.getTireur_Match();

		/**
		 * The meta object literal for the '{@link imt.imtmde.impl.FleurettisteImpl <em>Fleurettiste</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.impl.FleurettisteImpl
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getFleurettiste()
		 * @generated
		 */
		EClass FLEURETTISTE = eINSTANCE.getFleurettiste();

		/**
		 * The meta object literal for the '{@link imt.imtmde.impl.EpeisteImpl <em>Epeiste</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.impl.EpeisteImpl
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getEpeiste()
		 * @generated
		 */
		EClass EPEISTE = eINSTANCE.getEpeiste();

		/**
		 * The meta object literal for the '{@link imt.imtmde.impl.SabreurImpl <em>Sabreur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.impl.SabreurImpl
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getSabreur()
		 * @generated
		 */
		EClass SABREUR = eINSTANCE.getSabreur();

		/**
		 * The meta object literal for the '{@link imt.imtmde.TypeArme <em>Type Arme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.TypeArme
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getTypeArme()
		 * @generated
		 */
		EEnum TYPE_ARME = eINSTANCE.getTypeArme();

		/**
		 * The meta object literal for the '{@link imt.imtmde.TypeSexe <em>Type Sexe</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.TypeSexe
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getTypeSexe()
		 * @generated
		 */
		EEnum TYPE_SEXE = eINSTANCE.getTypeSexe();

		/**
		 * The meta object literal for the '{@link imt.imtmde.TypeCategorie <em>Type Categorie</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imt.imtmde.TypeCategorie
		 * @see imt.imtmde.impl.ImtmdePackageImpl#getTypeCategorie()
		 * @generated
		 */
		EEnum TYPE_CATEGORIE = eINSTANCE.getTypeCategorie();

	}

} //ImtmdePackage

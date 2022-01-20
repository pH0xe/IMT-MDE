/**
 */
package imt.imtmde.impl;

import imt.imtmde.Adresse;
import imt.imtmde.Club;
import imt.imtmde.Competition;
import imt.imtmde.Epeiste;
import imt.imtmde.Fleurettiste;
import imt.imtmde.ImtmdeFactory;
import imt.imtmde.ImtmdePackage;
import imt.imtmde.Match;
import imt.imtmde.Resultat;
import imt.imtmde.Sabreur;
import imt.imtmde.Tireur;
import imt.imtmde.TypeArme;
import imt.imtmde.TypeCategorie;
import imt.imtmde.TypeSexe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImtmdePackageImpl extends EPackageImpl implements ImtmdePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adresseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass competitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tireurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fleurettisteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epeisteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sabreurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeArmeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeSexeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeCategorieEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see imt.imtmde.ImtmdePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImtmdePackageImpl() {
		super(eNS_URI, ImtmdeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ImtmdePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImtmdePackage init() {
		if (isInited)
			return (ImtmdePackage) EPackage.Registry.INSTANCE.getEPackage(ImtmdePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredImtmdePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ImtmdePackageImpl theImtmdePackage = registeredImtmdePackage instanceof ImtmdePackageImpl
				? (ImtmdePackageImpl) registeredImtmdePackage
				: new ImtmdePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theImtmdePackage.createPackageContents();

		// Initialize created meta-data
		theImtmdePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImtmdePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImtmdePackage.eNS_URI, theImtmdePackage);
		return theImtmdePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdresse() {
		return adresseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdresse_AdressePostale() {
		return (EAttribute) adresseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdresse_CodePostal() {
		return (EAttribute) adresseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdresse_Ville() {
		return (EAttribute) adresseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompetition() {
		return competitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompetition_Nom() {
		return (EAttribute) competitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompetition_Club() {
		return (EReference) competitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompetition_Adresse() {
		return (EReference) competitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompetition_Match() {
		return (EReference) competitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClub() {
		return clubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClub_Nom() {
		return (EAttribute) clubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClub_Tireur() {
		return (EReference) clubEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClub_Adresse() {
		return (EReference) clubEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Arme() {
		return (EAttribute) matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Sexe() {
		return (EAttribute) matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Categorie() {
		return (EAttribute) matchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Resultat() {
		return (EReference) matchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Tireurs() {
		return (EReference) matchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultat() {
		return resultatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultat_Score() {
		return (EAttribute) resultatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultat_Temps() {
		return (EAttribute) resultatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTireur() {
		return tireurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTireur_Nom() {
		return (EAttribute) tireurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTireur_Prenom() {
		return (EAttribute) tireurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTireur_Categorie() {
		return (EAttribute) tireurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTireur_Sexe() {
		return (EAttribute) tireurEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTireur_Match() {
		return (EReference) tireurEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFleurettiste() {
		return fleurettisteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpeiste() {
		return epeisteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSabreur() {
		return sabreurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeArme() {
		return typeArmeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeSexe() {
		return typeSexeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeCategorie() {
		return typeCategorieEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImtmdeFactory getImtmdeFactory() {
		return (ImtmdeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		adresseEClass = createEClass(ADRESSE);
		createEAttribute(adresseEClass, ADRESSE__ADRESSE_POSTALE);
		createEAttribute(adresseEClass, ADRESSE__CODE_POSTAL);
		createEAttribute(adresseEClass, ADRESSE__VILLE);

		competitionEClass = createEClass(COMPETITION);
		createEAttribute(competitionEClass, COMPETITION__NOM);
		createEReference(competitionEClass, COMPETITION__CLUB);
		createEReference(competitionEClass, COMPETITION__ADRESSE);
		createEReference(competitionEClass, COMPETITION__MATCH);

		clubEClass = createEClass(CLUB);
		createEAttribute(clubEClass, CLUB__NOM);
		createEReference(clubEClass, CLUB__TIREUR);
		createEReference(clubEClass, CLUB__ADRESSE);

		matchEClass = createEClass(MATCH);
		createEAttribute(matchEClass, MATCH__ARME);
		createEAttribute(matchEClass, MATCH__SEXE);
		createEAttribute(matchEClass, MATCH__CATEGORIE);
		createEReference(matchEClass, MATCH__RESULTAT);
		createEReference(matchEClass, MATCH__TIREURS);

		resultatEClass = createEClass(RESULTAT);
		createEAttribute(resultatEClass, RESULTAT__SCORE);
		createEAttribute(resultatEClass, RESULTAT__TEMPS);

		tireurEClass = createEClass(TIREUR);
		createEAttribute(tireurEClass, TIREUR__NOM);
		createEAttribute(tireurEClass, TIREUR__PRENOM);
		createEAttribute(tireurEClass, TIREUR__CATEGORIE);
		createEAttribute(tireurEClass, TIREUR__SEXE);
		createEReference(tireurEClass, TIREUR__MATCH);

		fleurettisteEClass = createEClass(FLEURETTISTE);

		epeisteEClass = createEClass(EPEISTE);

		sabreurEClass = createEClass(SABREUR);

		// Create enums
		typeArmeEEnum = createEEnum(TYPE_ARME);
		typeSexeEEnum = createEEnum(TYPE_SEXE);
		typeCategorieEEnum = createEEnum(TYPE_CATEGORIE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fleurettisteEClass.getESuperTypes().add(this.getTireur());
		epeisteEClass.getESuperTypes().add(this.getTireur());
		sabreurEClass.getESuperTypes().add(this.getTireur());

		// Initialize classes, features, and operations; add parameters
		initEClass(adresseEClass, Adresse.class, "Adresse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdresse_AdressePostale(), ecorePackage.getEString(), "adressePostale", null, 0, 1,
				Adresse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdresse_CodePostal(), ecorePackage.getEInt(), "codePostal", null, 0, 1, Adresse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdresse_Ville(), ecorePackage.getEString(), "ville", null, 0, 1, Adresse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(competitionEClass, Competition.class, "Competition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompetition_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Competition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompetition_Club(), this.getClub(), null, "club", null, 0, -1, Competition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompetition_Adresse(), this.getAdresse(), null, "adresse", null, 1, 1, Competition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompetition_Match(), this.getMatch(), null, "match", null, 0, -1, Competition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clubEClass, Club.class, "Club", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClub_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Club.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClub_Tireur(), this.getTireur(), null, "tireur", null, 0, -1, Club.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getClub_Adresse(), this.getAdresse(), null, "adresse", null, 1, 1, Club.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatch_Arme(), this.getTypeArme(), "arme", "", 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Sexe(), this.getTypeSexe(), "sexe", "", 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Categorie(), this.getTypeCategorie(), "categorie", "", 0, 1, Match.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Resultat(), this.getResultat(), null, "resultat", null, 0, 1, Match.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Tireurs(), this.getTireur(), this.getTireur_Match(), "tireurs", null, 2, 2, Match.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultatEClass, Resultat.class, "Resultat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultat_Score(), ecorePackage.getEString(), "score", null, 0, 1, Resultat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultat_Temps(), ecorePackage.getEInt(), "temps", null, 0, 1, Resultat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tireurEClass, Tireur.class, "Tireur", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTireur_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Tireur.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTireur_Prenom(), ecorePackage.getEString(), "prenom", null, 0, 1, Tireur.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTireur_Categorie(), this.getTypeCategorie(), "categorie", "", 0, 1, Tireur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTireur_Sexe(), this.getTypeSexe(), "sexe", "", 0, 1, Tireur.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTireur_Match(), this.getMatch(), this.getMatch_Tireurs(), "match", null, 0, -1, Tireur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fleurettisteEClass, Fleurettiste.class, "Fleurettiste", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(epeisteEClass, Epeiste.class, "Epeiste", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sabreurEClass, Sabreur.class, "Sabreur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(typeArmeEEnum, TypeArme.class, "TypeArme");
		addEEnumLiteral(typeArmeEEnum, TypeArme.FLEURET);
		addEEnumLiteral(typeArmeEEnum, TypeArme.EPEE);
		addEEnumLiteral(typeArmeEEnum, TypeArme.SABRE);

		initEEnum(typeSexeEEnum, TypeSexe.class, "TypeSexe");
		addEEnumLiteral(typeSexeEEnum, TypeSexe.FEMME);
		addEEnumLiteral(typeSexeEEnum, TypeSexe.HOMME);
		addEEnumLiteral(typeSexeEEnum, TypeSexe.MIXTE);

		initEEnum(typeCategorieEEnum, TypeCategorie.class, "TypeCategorie");
		addEEnumLiteral(typeCategorieEEnum, TypeCategorie.M15);
		addEEnumLiteral(typeCategorieEEnum, TypeCategorie.M20);
		addEEnumLiteral(typeCategorieEEnum, TypeCategorie.SENIOR);

		// Create resource
		createResource(eNS_URI);
	}

} //ImtmdePackageImpl

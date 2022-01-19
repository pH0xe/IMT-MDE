/**
 */
package imt.imtmde.impl;

import imt.imtmde.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImtmdeFactoryImpl extends EFactoryImpl implements ImtmdeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImtmdeFactory init() {
		try {
			ImtmdeFactory theImtmdeFactory = (ImtmdeFactory) EPackage.Registry.INSTANCE
					.getEFactory(ImtmdePackage.eNS_URI);
			if (theImtmdeFactory != null) {
				return theImtmdeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImtmdeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImtmdeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ImtmdePackage.ADRESSE:
			return createAdresse();
		case ImtmdePackage.COMPETITION:
			return createCompetition();
		case ImtmdePackage.CLUB:
			return createClub();
		case ImtmdePackage.MATCH:
			return createMatch();
		case ImtmdePackage.RESULTAT:
			return createResultat();
		case ImtmdePackage.FLEURETTISTE:
			return createFleurettiste();
		case ImtmdePackage.EPEISTE:
			return createEpeiste();
		case ImtmdePackage.SABREUR:
			return createSabreur();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ImtmdePackage.TYPE_ARME:
			return createTypeArmeFromString(eDataType, initialValue);
		case ImtmdePackage.TYPE_SEXE:
			return createTypeSexeFromString(eDataType, initialValue);
		case ImtmdePackage.TYPE_CATEGORIE:
			return createTypeCategorieFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ImtmdePackage.TYPE_ARME:
			return convertTypeArmeToString(eDataType, instanceValue);
		case ImtmdePackage.TYPE_SEXE:
			return convertTypeSexeToString(eDataType, instanceValue);
		case ImtmdePackage.TYPE_CATEGORIE:
			return convertTypeCategorieToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adresse createAdresse() {
		AdresseImpl adresse = new AdresseImpl();
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Competition createCompetition() {
		CompetitionImpl competition = new CompetitionImpl();
		return competition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Club createClub() {
		ClubImpl club = new ClubImpl();
		return club;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resultat createResultat() {
		ResultatImpl resultat = new ResultatImpl();
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fleurettiste createFleurettiste() {
		FleurettisteImpl fleurettiste = new FleurettisteImpl();
		return fleurettiste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epeiste createEpeiste() {
		EpeisteImpl epeiste = new EpeisteImpl();
		return epeiste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sabreur createSabreur() {
		SabreurImpl sabreur = new SabreurImpl();
		return sabreur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeArme createTypeArmeFromString(EDataType eDataType, String initialValue) {
		TypeArme result = TypeArme.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeArmeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSexe createTypeSexeFromString(EDataType eDataType, String initialValue) {
		TypeSexe result = TypeSexe.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeSexeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCategorie createTypeCategorieFromString(EDataType eDataType, String initialValue) {
		TypeCategorie result = TypeCategorie.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeCategorieToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImtmdePackage getImtmdePackage() {
		return (ImtmdePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImtmdePackage getPackage() {
		return ImtmdePackage.eINSTANCE;
	}

} //ImtmdeFactoryImpl

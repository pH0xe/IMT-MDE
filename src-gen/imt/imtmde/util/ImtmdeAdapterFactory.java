/**
 */
package imt.imtmde.util;

import imt.imtmde.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see imt.imtmde.ImtmdePackage
 * @generated
 */
public class ImtmdeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImtmdePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImtmdeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImtmdePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImtmdeSwitch<Adapter> modelSwitch = new ImtmdeSwitch<Adapter>() {
		@Override
		public Adapter caseAdresse(Adresse object) {
			return createAdresseAdapter();
		}

		@Override
		public Adapter caseCompetition(Competition object) {
			return createCompetitionAdapter();
		}

		@Override
		public Adapter caseClub(Club object) {
			return createClubAdapter();
		}

		@Override
		public Adapter caseMatch(Match object) {
			return createMatchAdapter();
		}

		@Override
		public Adapter caseResultat(Resultat object) {
			return createResultatAdapter();
		}

		@Override
		public Adapter caseTireur(Tireur object) {
			return createTireurAdapter();
		}

		@Override
		public Adapter caseFleurettiste(Fleurettiste object) {
			return createFleurettisteAdapter();
		}

		@Override
		public Adapter caseEpeiste(Epeiste object) {
			return createEpeisteAdapter();
		}

		@Override
		public Adapter caseSabreur(Sabreur object) {
			return createSabreurAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link imt.imtmde.Adresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imt.imtmde.Adresse
	 * @generated
	 */
	public Adapter createAdresseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imt.imtmde.Competition <em>Competition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imt.imtmde.Competition
	 * @generated
	 */
	public Adapter createCompetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imt.imtmde.Club <em>Club</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imt.imtmde.Club
	 * @generated
	 */
	public Adapter createClubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imt.imtmde.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imt.imtmde.Match
	 * @generated
	 */
	public Adapter createMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imt.imtmde.Resultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imt.imtmde.Resultat
	 * @generated
	 */
	public Adapter createResultatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imt.imtmde.Tireur <em>Tireur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imt.imtmde.Tireur
	 * @generated
	 */
	public Adapter createTireurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imt.imtmde.Fleurettiste <em>Fleurettiste</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imt.imtmde.Fleurettiste
	 * @generated
	 */
	public Adapter createFleurettisteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imt.imtmde.Epeiste <em>Epeiste</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imt.imtmde.Epeiste
	 * @generated
	 */
	public Adapter createEpeisteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link imt.imtmde.Sabreur <em>Sabreur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see imt.imtmde.Sabreur
	 * @generated
	 */
	public Adapter createSabreurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ImtmdeAdapterFactory

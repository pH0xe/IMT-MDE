/**
 */
package imt.imtmde.impl;

import imt.imtmde.ImtmdePackage;
import imt.imtmde.Match;
import imt.imtmde.Resultat;
import imt.imtmde.Tireur;
import imt.imtmde.TypeArme;
import imt.imtmde.TypeCategorie;
import imt.imtmde.TypeSexe;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.impl.MatchImpl#getArme <em>Arme</em>}</li>
 *   <li>{@link imt.imtmde.impl.MatchImpl#getSexe <em>Sexe</em>}</li>
 *   <li>{@link imt.imtmde.impl.MatchImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link imt.imtmde.impl.MatchImpl#getResultat <em>Resultat</em>}</li>
 *   <li>{@link imt.imtmde.impl.MatchImpl#getTireurs <em>Tireurs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #getArme() <em>Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArme()
	 * @generated
	 * @ordered
	 */
	protected static final TypeArme ARME_EDEFAULT = TypeArme.FLEURET;

	/**
	 * The cached value of the '{@link #getArme() <em>Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArme()
	 * @generated
	 * @ordered
	 */
	protected TypeArme arme = ARME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSexe() <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexe()
	 * @generated
	 * @ordered
	 */
	protected static final TypeSexe SEXE_EDEFAULT = TypeSexe.FEMME;

	/**
	 * The cached value of the '{@link #getSexe() <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexe()
	 * @generated
	 * @ordered
	 */
	protected TypeSexe sexe = SEXE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeCategorie CATEGORIE_EDEFAULT = TypeCategorie.M15;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultat() <em>Resultat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultat()
	 * @generated
	 * @ordered
	 */
	protected Resultat resultat;

	/**
	 * The cached value of the '{@link #getTireurs() <em>Tireurs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTireurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Tireur> tireurs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImtmdePackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeArme getArme() {
		return arme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArme(TypeArme newArme) {
		TypeArme oldArme = arme;
		arme = newArme == null ? ARME_EDEFAULT : newArme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.MATCH__ARME, oldArme, arme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSexe getSexe() {
		return sexe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSexe(TypeSexe newSexe) {
		TypeSexe oldSexe = sexe;
		sexe = newSexe == null ? SEXE_EDEFAULT : newSexe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.MATCH__SEXE, oldSexe, sexe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeCategorie newCategorie) {
		TypeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.MATCH__CATEGORIE, oldCategorie,
					categorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resultat getResultat() {
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultat(Resultat newResultat, NotificationChain msgs) {
		Resultat oldResultat = resultat;
		resultat = newResultat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ImtmdePackage.MATCH__RESULTAT, oldResultat, newResultat);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultat(Resultat newResultat) {
		if (newResultat != resultat) {
			NotificationChain msgs = null;
			if (resultat != null)
				msgs = ((InternalEObject) resultat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ImtmdePackage.MATCH__RESULTAT, null, msgs);
			if (newResultat != null)
				msgs = ((InternalEObject) newResultat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ImtmdePackage.MATCH__RESULTAT, null, msgs);
			msgs = basicSetResultat(newResultat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.MATCH__RESULTAT, newResultat,
					newResultat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tireur> getTireurs() {
		if (tireurs == null) {
			tireurs = new EObjectWithInverseResolvingEList.ManyInverse<Tireur>(Tireur.class, this,
					ImtmdePackage.MATCH__TIREURS, ImtmdePackage.TIREUR__MATCH);
		}
		return tireurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ImtmdePackage.MATCH__TIREURS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTireurs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ImtmdePackage.MATCH__RESULTAT:
			return basicSetResultat(null, msgs);
		case ImtmdePackage.MATCH__TIREURS:
			return ((InternalEList<?>) getTireurs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ImtmdePackage.MATCH__ARME:
			return getArme();
		case ImtmdePackage.MATCH__SEXE:
			return getSexe();
		case ImtmdePackage.MATCH__CATEGORIE:
			return getCategorie();
		case ImtmdePackage.MATCH__RESULTAT:
			return getResultat();
		case ImtmdePackage.MATCH__TIREURS:
			return getTireurs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ImtmdePackage.MATCH__ARME:
			setArme((TypeArme) newValue);
			return;
		case ImtmdePackage.MATCH__SEXE:
			setSexe((TypeSexe) newValue);
			return;
		case ImtmdePackage.MATCH__CATEGORIE:
			setCategorie((TypeCategorie) newValue);
			return;
		case ImtmdePackage.MATCH__RESULTAT:
			setResultat((Resultat) newValue);
			return;
		case ImtmdePackage.MATCH__TIREURS:
			getTireurs().clear();
			getTireurs().addAll((Collection<? extends Tireur>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ImtmdePackage.MATCH__ARME:
			setArme(ARME_EDEFAULT);
			return;
		case ImtmdePackage.MATCH__SEXE:
			setSexe(SEXE_EDEFAULT);
			return;
		case ImtmdePackage.MATCH__CATEGORIE:
			setCategorie(CATEGORIE_EDEFAULT);
			return;
		case ImtmdePackage.MATCH__RESULTAT:
			setResultat((Resultat) null);
			return;
		case ImtmdePackage.MATCH__TIREURS:
			getTireurs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ImtmdePackage.MATCH__ARME:
			return arme != ARME_EDEFAULT;
		case ImtmdePackage.MATCH__SEXE:
			return sexe != SEXE_EDEFAULT;
		case ImtmdePackage.MATCH__CATEGORIE:
			return categorie != CATEGORIE_EDEFAULT;
		case ImtmdePackage.MATCH__RESULTAT:
			return resultat != null;
		case ImtmdePackage.MATCH__TIREURS:
			return tireurs != null && !tireurs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (arme: ");
		result.append(arme);
		result.append(", sexe: ");
		result.append(sexe);
		result.append(", categorie: ");
		result.append(categorie);
		result.append(')');
		return result.toString();
	}

} //MatchImpl

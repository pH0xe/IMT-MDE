/**
 */
package imt.imtmde.impl;

import imt.imtmde.Adresse;
import imt.imtmde.Club;
import imt.imtmde.Competition;
import imt.imtmde.ImtmdePackage;
import imt.imtmde.Match;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Competition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imt.imtmde.impl.CompetitionImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link imt.imtmde.impl.CompetitionImpl#getClub <em>Club</em>}</li>
 *   <li>{@link imt.imtmde.impl.CompetitionImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link imt.imtmde.impl.CompetitionImpl#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompetitionImpl extends MinimalEObjectImpl.Container implements Competition {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClub() <em>Club</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClub()
	 * @generated
	 * @ordered
	 */
	protected EList<Club> club;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected Adresse adresse;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> match;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompetitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImtmdePackage.Literals.COMPETITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.COMPETITION__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Club> getClub() {
		if (club == null) {
			club = new EObjectContainmentEList<Club>(Club.class, this, ImtmdePackage.COMPETITION__CLUB);
		}
		return club;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdresse(Adresse newAdresse, NotificationChain msgs) {
		Adresse oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ImtmdePackage.COMPETITION__ADRESSE, oldAdresse, newAdresse);
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
	public void setAdresse(Adresse newAdresse) {
		if (newAdresse != adresse) {
			NotificationChain msgs = null;
			if (adresse != null)
				msgs = ((InternalEObject) adresse).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ImtmdePackage.COMPETITION__ADRESSE, null, msgs);
			if (newAdresse != null)
				msgs = ((InternalEObject) newAdresse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ImtmdePackage.COMPETITION__ADRESSE, null, msgs);
			msgs = basicSetAdresse(newAdresse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImtmdePackage.COMPETITION__ADRESSE, newAdresse,
					newAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatch() {
		if (match == null) {
			match = new EObjectContainmentEList<Match>(Match.class, this, ImtmdePackage.COMPETITION__MATCH);
		}
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ImtmdePackage.COMPETITION__CLUB:
			return ((InternalEList<?>) getClub()).basicRemove(otherEnd, msgs);
		case ImtmdePackage.COMPETITION__ADRESSE:
			return basicSetAdresse(null, msgs);
		case ImtmdePackage.COMPETITION__MATCH:
			return ((InternalEList<?>) getMatch()).basicRemove(otherEnd, msgs);
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
		case ImtmdePackage.COMPETITION__NOM:
			return getNom();
		case ImtmdePackage.COMPETITION__CLUB:
			return getClub();
		case ImtmdePackage.COMPETITION__ADRESSE:
			return getAdresse();
		case ImtmdePackage.COMPETITION__MATCH:
			return getMatch();
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
		case ImtmdePackage.COMPETITION__NOM:
			setNom((String) newValue);
			return;
		case ImtmdePackage.COMPETITION__CLUB:
			getClub().clear();
			getClub().addAll((Collection<? extends Club>) newValue);
			return;
		case ImtmdePackage.COMPETITION__ADRESSE:
			setAdresse((Adresse) newValue);
			return;
		case ImtmdePackage.COMPETITION__MATCH:
			getMatch().clear();
			getMatch().addAll((Collection<? extends Match>) newValue);
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
		case ImtmdePackage.COMPETITION__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case ImtmdePackage.COMPETITION__CLUB:
			getClub().clear();
			return;
		case ImtmdePackage.COMPETITION__ADRESSE:
			setAdresse((Adresse) null);
			return;
		case ImtmdePackage.COMPETITION__MATCH:
			getMatch().clear();
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
		case ImtmdePackage.COMPETITION__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case ImtmdePackage.COMPETITION__CLUB:
			return club != null && !club.isEmpty();
		case ImtmdePackage.COMPETITION__ADRESSE:
			return adresse != null;
		case ImtmdePackage.COMPETITION__MATCH:
			return match != null && !match.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //CompetitionImpl

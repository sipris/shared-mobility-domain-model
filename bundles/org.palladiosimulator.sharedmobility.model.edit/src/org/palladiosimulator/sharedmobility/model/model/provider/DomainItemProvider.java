/**
 */
package org.palladiosimulator.sharedmobility.model.model.provider;


import java.util.Collection;
import java.util.List;

import model.provider.SharedMobilityEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.sharedmobility.model.model.Domain;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelFactory;
import org.palladiosimulator.sharedmobility.model.model.SharedmobilityModelPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.sharedmobility.model.model.Domain} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SharedmobilityModelPackage.Literals.DOMAIN__PARPICIPANTS);
			childrenFeatures.add(SharedmobilityModelPackage.Literals.DOMAIN__VEHICLE);
			childrenFeatures.add(SharedmobilityModelPackage.Literals.DOMAIN__ATTACKER);
			childrenFeatures.add(SharedmobilityModelPackage.Literals.DOMAIN__PROVIDER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Domain.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Domain"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Domain_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Domain.class)) {
			case SharedmobilityModelPackage.DOMAIN__PARPICIPANTS:
			case SharedmobilityModelPackage.DOMAIN__VEHICLE:
			case SharedmobilityModelPackage.DOMAIN__ATTACKER:
			case SharedmobilityModelPackage.DOMAIN__PROVIDER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SharedmobilityModelPackage.Literals.DOMAIN__PARPICIPANTS,
				 SharedmobilityModelFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(SharedmobilityModelPackage.Literals.DOMAIN__PARPICIPANTS,
				 SharedmobilityModelFactory.eINSTANCE.createDriver()));

		newChildDescriptors.add
			(createChildParameter
				(SharedmobilityModelPackage.Literals.DOMAIN__PARPICIPANTS,
				 SharedmobilityModelFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(SharedmobilityModelPackage.Literals.DOMAIN__VEHICLE,
				 SharedmobilityModelFactory.eINSTANCE.createCar()));

		newChildDescriptors.add
			(createChildParameter
				(SharedmobilityModelPackage.Literals.DOMAIN__VEHICLE,
				 SharedmobilityModelFactory.eINSTANCE.createVan()));

		newChildDescriptors.add
			(createChildParameter
				(SharedmobilityModelPackage.Literals.DOMAIN__ATTACKER,
				 SharedmobilityModelFactory.eINSTANCE.createAttacker()));

		newChildDescriptors.add
			(createChildParameter
				(SharedmobilityModelPackage.Literals.DOMAIN__PROVIDER,
				 SharedmobilityModelFactory.eINSTANCE.createMobilityServiceProvider()));

		newChildDescriptors.add
			(createChildParameter
				(SharedmobilityModelPackage.Literals.DOMAIN__PROVIDER,
				 SharedmobilityModelFactory.eINSTANCE.createRidePoolingProvider()));

		newChildDescriptors.add
			(createChildParameter
				(SharedmobilityModelPackage.Literals.DOMAIN__PROVIDER,
				 SharedmobilityModelFactory.eINSTANCE.createCarpoolingProvider()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SharedMobilityEditPlugin.INSTANCE;
	}

}

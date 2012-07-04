/**
 * UbiCompForAll
 */
package org.ubicompforall.descriptor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ubicompforall.descriptor.UbiCompDescriptorFactory
 * @model kind="package"
 * @generated
 */
public interface UbiCompDescriptorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "descriptor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ubicompforall.org/descriptor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "descriptor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UbiCompDescriptorPackage eINSTANCE = org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.NamedElementImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__USER_FRIENDLY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.DescriptorLibraryImpl <em>Descriptor Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.DescriptorLibraryImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getDescriptorLibrary()
	 * @generated
	 */
	int DESCRIPTOR_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_LIBRARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_LIBRARY__USER_FRIENDLY_NAME = NAMED_ELEMENT__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_LIBRARY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Building Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_LIBRARY__BUILDING_BLOCKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Descriptor Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_LIBRARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.ClassifierImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__USER_FRIENDLY_NAME = NAMED_ELEMENT__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.BuildingBlockDescImpl <em>Building Block Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.BuildingBlockDescImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getBuildingBlockDesc()
	 * @generated
	 */
	int BUILDING_BLOCK_DESC = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_DESC__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_DESC__USER_FRIENDLY_NAME = CLASSIFIER__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_DESC__DESCRIPTION = CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_DESC__PROPERTIES = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_DESC__ICON_URL = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Building Block Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_DESC_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.TriggerDescImpl <em>Trigger Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.TriggerDescImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getTriggerDesc()
	 * @generated
	 */
	int TRIGGER_DESC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESC__NAME = BUILDING_BLOCK_DESC__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESC__USER_FRIENDLY_NAME = BUILDING_BLOCK_DESC__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESC__DESCRIPTION = BUILDING_BLOCK_DESC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESC__PROPERTIES = BUILDING_BLOCK_DESC__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESC__ICON_URL = BUILDING_BLOCK_DESC__ICON_URL;

	/**
	 * The number of structural features of the '<em>Trigger Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DESC_FEATURE_COUNT = BUILDING_BLOCK_DESC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.ConditionDescImpl <em>Condition Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.ConditionDescImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getConditionDesc()
	 * @generated
	 */
	int CONDITION_DESC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DESC__NAME = BUILDING_BLOCK_DESC__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DESC__USER_FRIENDLY_NAME = BUILDING_BLOCK_DESC__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DESC__DESCRIPTION = BUILDING_BLOCK_DESC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DESC__PROPERTIES = BUILDING_BLOCK_DESC__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DESC__ICON_URL = BUILDING_BLOCK_DESC__ICON_URL;

	/**
	 * The number of structural features of the '<em>Condition Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DESC_FEATURE_COUNT = BUILDING_BLOCK_DESC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.StepDescImpl <em>Step Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.StepDescImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getStepDesc()
	 * @generated
	 */
	int STEP_DESC = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DESC__NAME = BUILDING_BLOCK_DESC__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DESC__USER_FRIENDLY_NAME = BUILDING_BLOCK_DESC__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DESC__DESCRIPTION = BUILDING_BLOCK_DESC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DESC__PROPERTIES = BUILDING_BLOCK_DESC__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DESC__ICON_URL = BUILDING_BLOCK_DESC__ICON_URL;

	/**
	 * The number of structural features of the '<em>Step Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DESC_FEATURE_COUNT = BUILDING_BLOCK_DESC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.ConditionalStepDescImpl <em>Conditional Step Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.ConditionalStepDescImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getConditionalStepDesc()
	 * @generated
	 */
	int CONDITIONAL_STEP_DESC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_DESC__NAME = STEP_DESC__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_DESC__USER_FRIENDLY_NAME = STEP_DESC__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_DESC__DESCRIPTION = STEP_DESC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_DESC__PROPERTIES = STEP_DESC__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_DESC__ICON_URL = STEP_DESC__ICON_URL;

	/**
	 * The number of structural features of the '<em>Conditional Step Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_DESC_FEATURE_COUNT = STEP_DESC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.DomObjRefDescImpl <em>Dom Obj Ref Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.DomObjRefDescImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getDomObjRefDesc()
	 * @generated
	 */
	int DOM_OBJ_REF_DESC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJ_REF_DESC__NAME = BUILDING_BLOCK_DESC__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJ_REF_DESC__USER_FRIENDLY_NAME = BUILDING_BLOCK_DESC__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJ_REF_DESC__DESCRIPTION = BUILDING_BLOCK_DESC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJ_REF_DESC__PROPERTIES = BUILDING_BLOCK_DESC__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJ_REF_DESC__ICON_URL = BUILDING_BLOCK_DESC__ICON_URL;

	/**
	 * The number of structural features of the '<em>Dom Obj Ref Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJ_REF_DESC_FEATURE_COUNT = BUILDING_BLOCK_DESC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.QueryDescImpl <em>Query Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.QueryDescImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getQueryDesc()
	 * @generated
	 */
	int QUERY_DESC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DESC__NAME = BUILDING_BLOCK_DESC__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DESC__USER_FRIENDLY_NAME = BUILDING_BLOCK_DESC__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DESC__DESCRIPTION = BUILDING_BLOCK_DESC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DESC__PROPERTIES = BUILDING_BLOCK_DESC__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DESC__ICON_URL = BUILDING_BLOCK_DESC__ICON_URL;

	/**
	 * The number of structural features of the '<em>Query Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DESC_FEATURE_COUNT = BUILDING_BLOCK_DESC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.PropertyImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__USER_FRIENDLY_NAME = NAMED_ELEMENT__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Can Refer To Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CAN_REFER_TO_OTHER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Can Be Refered To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CAN_BE_REFERED_TO = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_RESULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allowed Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ALLOWED_VALUES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.ValueImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ubicompforall.descriptor.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ubicompforall.descriptor.impl.DataTypeImpl
	 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>User Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__USER_FRIENDLY_NAME = CLASSIFIER__USER_FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DESCRIPTION = CLASSIFIER__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.DescriptorLibrary <em>Descriptor Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor Library</em>'.
	 * @see org.ubicompforall.descriptor.DescriptorLibrary
	 * @generated
	 */
	EClass getDescriptorLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ubicompforall.descriptor.DescriptorLibrary#getBuildingBlocks <em>Building Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Blocks</em>'.
	 * @see org.ubicompforall.descriptor.DescriptorLibrary#getBuildingBlocks()
	 * @see #getDescriptorLibrary()
	 * @generated
	 */
	EReference getDescriptorLibrary_BuildingBlocks();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.TriggerDesc <em>Trigger Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Desc</em>'.
	 * @see org.ubicompforall.descriptor.TriggerDesc
	 * @generated
	 */
	EClass getTriggerDesc();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.ConditionDesc <em>Condition Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Desc</em>'.
	 * @see org.ubicompforall.descriptor.ConditionDesc
	 * @generated
	 */
	EClass getConditionDesc();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.ConditionalStepDesc <em>Conditional Step Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Step Desc</em>'.
	 * @see org.ubicompforall.descriptor.ConditionalStepDesc
	 * @generated
	 */
	EClass getConditionalStepDesc();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.DomObjRefDesc <em>Dom Obj Ref Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dom Obj Ref Desc</em>'.
	 * @see org.ubicompforall.descriptor.DomObjRefDesc
	 * @generated
	 */
	EClass getDomObjRefDesc();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.QueryDesc <em>Query Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Desc</em>'.
	 * @see org.ubicompforall.descriptor.QueryDesc
	 * @generated
	 */
	EClass getQueryDesc();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.BuildingBlockDesc <em>Building Block Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Block Desc</em>'.
	 * @see org.ubicompforall.descriptor.BuildingBlockDesc
	 * @generated
	 */
	EClass getBuildingBlockDesc();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ubicompforall.descriptor.BuildingBlockDesc#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.ubicompforall.descriptor.BuildingBlockDesc#getProperties()
	 * @see #getBuildingBlockDesc()
	 * @generated
	 */
	EReference getBuildingBlockDesc_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.descriptor.BuildingBlockDesc#getIconUrl <em>Icon Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Url</em>'.
	 * @see org.ubicompforall.descriptor.BuildingBlockDesc#getIconUrl()
	 * @see #getBuildingBlockDesc()
	 * @generated
	 */
	EAttribute getBuildingBlockDesc_IconUrl();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.ubicompforall.descriptor.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.descriptor.Property#isCanReferToOther <em>Can Refer To Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Refer To Other</em>'.
	 * @see org.ubicompforall.descriptor.Property#isCanReferToOther()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_CanReferToOther();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.descriptor.Property#isCanBeReferedTo <em>Can Be Refered To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Be Refered To</em>'.
	 * @see org.ubicompforall.descriptor.Property#isCanBeReferedTo()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_CanBeReferedTo();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.descriptor.Property#isIsResultValue <em>Is Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Result Value</em>'.
	 * @see org.ubicompforall.descriptor.Property#isIsResultValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsResultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ubicompforall.descriptor.Property#getAllowedValues <em>Allowed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed Values</em>'.
	 * @see org.ubicompforall.descriptor.Property#getAllowedValues()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_AllowedValues();

	/**
	 * Returns the meta object for the reference '{@link org.ubicompforall.descriptor.Property#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.ubicompforall.descriptor.Property#getDataType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.descriptor.Property#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.ubicompforall.descriptor.Property#getLowerBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.descriptor.Property#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.ubicompforall.descriptor.Property#getUpperBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.ubicompforall.descriptor.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.descriptor.Value#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ubicompforall.descriptor.Value#getName()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Name();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.StepDesc <em>Step Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Desc</em>'.
	 * @see org.ubicompforall.descriptor.StepDesc
	 * @generated
	 */
	EClass getStepDesc();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see org.ubicompforall.descriptor.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.ubicompforall.descriptor.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.descriptor.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ubicompforall.descriptor.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.descriptor.NamedElement#getUserFriendlyName <em>User Friendly Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Friendly Name</em>'.
	 * @see org.ubicompforall.descriptor.NamedElement#getUserFriendlyName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_UserFriendlyName();

	/**
	 * Returns the meta object for the attribute '{@link org.ubicompforall.descriptor.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.ubicompforall.descriptor.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link org.ubicompforall.descriptor.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.ubicompforall.descriptor.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UbiCompDescriptorFactory getUbiCompDescriptorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.DescriptorLibraryImpl <em>Descriptor Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.DescriptorLibraryImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getDescriptorLibrary()
		 * @generated
		 */
		EClass DESCRIPTOR_LIBRARY = eINSTANCE.getDescriptorLibrary();

		/**
		 * The meta object literal for the '<em><b>Building Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR_LIBRARY__BUILDING_BLOCKS = eINSTANCE.getDescriptorLibrary_BuildingBlocks();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.TriggerDescImpl <em>Trigger Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.TriggerDescImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getTriggerDesc()
		 * @generated
		 */
		EClass TRIGGER_DESC = eINSTANCE.getTriggerDesc();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.ConditionDescImpl <em>Condition Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.ConditionDescImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getConditionDesc()
		 * @generated
		 */
		EClass CONDITION_DESC = eINSTANCE.getConditionDesc();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.ConditionalStepDescImpl <em>Conditional Step Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.ConditionalStepDescImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getConditionalStepDesc()
		 * @generated
		 */
		EClass CONDITIONAL_STEP_DESC = eINSTANCE.getConditionalStepDesc();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.DomObjRefDescImpl <em>Dom Obj Ref Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.DomObjRefDescImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getDomObjRefDesc()
		 * @generated
		 */
		EClass DOM_OBJ_REF_DESC = eINSTANCE.getDomObjRefDesc();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.QueryDescImpl <em>Query Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.QueryDescImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getQueryDesc()
		 * @generated
		 */
		EClass QUERY_DESC = eINSTANCE.getQueryDesc();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.BuildingBlockDescImpl <em>Building Block Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.BuildingBlockDescImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getBuildingBlockDesc()
		 * @generated
		 */
		EClass BUILDING_BLOCK_DESC = eINSTANCE.getBuildingBlockDesc();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_BLOCK_DESC__PROPERTIES = eINSTANCE.getBuildingBlockDesc_Properties();

		/**
		 * The meta object literal for the '<em><b>Icon Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_BLOCK_DESC__ICON_URL = eINSTANCE.getBuildingBlockDesc_IconUrl();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.PropertyImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Can Refer To Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CAN_REFER_TO_OTHER = eINSTANCE.getProperty_CanReferToOther();

		/**
		 * The meta object literal for the '<em><b>Can Be Refered To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CAN_BE_REFERED_TO = eINSTANCE.getProperty_CanBeReferedTo();

		/**
		 * The meta object literal for the '<em><b>Is Result Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_RESULT_VALUE = eINSTANCE.getProperty_IsResultValue();

		/**
		 * The meta object literal for the '<em><b>Allowed Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ALLOWED_VALUES = eINSTANCE.getProperty_AllowedValues();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DATA_TYPE = eINSTANCE.getProperty_DataType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LOWER_BOUND = eINSTANCE.getProperty_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UPPER_BOUND = eINSTANCE.getProperty_UpperBound();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.ValueImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__NAME = eINSTANCE.getValue_Name();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.StepDescImpl <em>Step Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.StepDescImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getStepDesc()
		 * @generated
		 */
		EClass STEP_DESC = eINSTANCE.getStepDesc();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.ClassifierImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.NamedElementImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>User Friendly Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__USER_FRIENDLY_NAME = eINSTANCE.getNamedElement_UserFriendlyName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '{@link org.ubicompforall.descriptor.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ubicompforall.descriptor.impl.DataTypeImpl
		 * @see org.ubicompforall.descriptor.impl.UbiCompDescriptorPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

	}

} //UbiCompDescriptorPackage

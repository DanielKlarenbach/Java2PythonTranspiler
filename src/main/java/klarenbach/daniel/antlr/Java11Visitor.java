// Generated from Java11.g4 by ANTLR 4.9.2
package klarenbach.daniel.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java11Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java11Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java11Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java11Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Java11Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(Java11Parser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(Java11Parser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(Java11Parser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(Java11Parser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(Java11Parser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(Java11Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(Java11Parser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(Java11Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(Java11Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(Java11Parser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(Java11Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(Java11Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(Java11Parser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Java11Parser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(Java11Parser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(Java11Parser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(Java11Parser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(Java11Parser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(Java11Parser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(Java11Parser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(Java11Parser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(Java11Parser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(Java11Parser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(Java11Parser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(Java11Parser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(Java11Parser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(Java11Parser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(Java11Parser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(Java11Parser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(Java11Parser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(Java11Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(Java11Parser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(Java11Parser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(Java11Parser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(Java11Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(Java11Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(Java11Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(Java11Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(Java11Parser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Java11Parser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(Java11Parser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(Java11Parser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(Java11Parser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(Java11Parser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(Java11Parser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(Java11Parser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(Java11Parser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Java11Parser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(Java11Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(Java11Parser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(Java11Parser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(Java11Parser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(Java11Parser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(Java11Parser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(Java11Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(Java11Parser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(Java11Parser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(Java11Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(Java11Parser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(Java11Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(Java11Parser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(Java11Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(Java11Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(Java11Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(Java11Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java11Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(Java11Parser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(Java11Parser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Java11Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(Java11Parser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(Java11Parser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(Java11Parser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(Java11Parser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(Java11Parser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(Java11Parser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(Java11Parser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(Java11Parser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(Java11Parser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(Java11Parser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(Java11Parser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(Java11Parser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(Java11Parser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(Java11Parser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(Java11Parser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(Java11Parser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(Java11Parser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(Java11Parser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(Java11Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(Java11Parser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(Java11Parser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(Java11Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(Java11Parser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(Java11Parser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(Java11Parser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(Java11Parser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(Java11Parser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(Java11Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(Java11Parser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(Java11Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(Java11Parser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(Java11Parser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(Java11Parser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(Java11Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(Java11Parser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(Java11Parser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(Java11Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(Java11Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(Java11Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(Java11Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(Java11Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(Java11Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(Java11Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(Java11Parser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(Java11Parser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(Java11Parser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(Java11Parser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(Java11Parser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(Java11Parser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(Java11Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(Java11Parser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(Java11Parser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(Java11Parser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(Java11Parser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(Java11Parser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Java11Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(Java11Parser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(Java11Parser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(Java11Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(Java11Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Java11Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(Java11Parser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(Java11Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(Java11Parser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(Java11Parser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(Java11Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Java11Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(Java11Parser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(Java11Parser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(Java11Parser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(Java11Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(Java11Parser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(Java11Parser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(Java11Parser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(Java11Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(Java11Parser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(Java11Parser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(Java11Parser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Java11Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(Java11Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(Java11Parser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Java11Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(Java11Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(Java11Parser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(Java11Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(Java11Parser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(Java11Parser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(Java11Parser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(Java11Parser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(Java11Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(Java11Parser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(Java11Parser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Java11Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(Java11Parser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(Java11Parser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(Java11Parser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(Java11Parser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(Java11Parser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(Java11Parser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(Java11Parser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(Java11Parser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(Java11Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(Java11Parser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(Java11Parser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(Java11Parser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Java11Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(Java11Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(Java11Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(Java11Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(Java11Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java11Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java11Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(Java11Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java11Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java11Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(Java11Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(Java11Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(Java11Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(Java11Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(Java11Parser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(Java11Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(Java11Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(Java11Parser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(Java11Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(Java11Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(Java11Parser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(Java11Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(Java11Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Java11Parser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(Java11Parser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(Java11Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(Java11Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(Java11Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(Java11Parser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(Java11Parser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(Java11Parser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Java11Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(Java11Parser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(Java11Parser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(Java11Parser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(Java11Parser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(Java11Parser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Java11Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(Java11Parser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Java11Parser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(Java11Parser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(Java11Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(Java11Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(Java11Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(Java11Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Java11Parser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Java11Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Java11Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(Java11Parser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Java11Parser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Java11Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Java11Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(Java11Parser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(Java11Parser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(Java11Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Java11Parser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(Java11Parser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(Java11Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(Java11Parser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(Java11Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java11Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(Java11Parser.CastExpressionContext ctx);
}
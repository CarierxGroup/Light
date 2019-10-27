/*    */ package org.spongepowered.asm.mixin.injection.points;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import org.spongepowered.asm.lib.Type;
/*    */ import org.spongepowered.asm.lib.tree.AbstractInsnNode;
/*    */ import org.spongepowered.asm.lib.tree.InsnList;
/*    */ import org.spongepowered.asm.lib.tree.MethodInsnNode;
/*    */ import org.spongepowered.asm.mixin.injection.InjectionPoint;
/*    */ import org.spongepowered.asm.mixin.injection.InjectionPoint.AtCode;
/*    */ import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @AtCode("INVOKE_ASSIGN")
/*    */ public class AfterInvoke
/*    */   extends BeforeInvoke
/*    */ {
/* 73 */   public AfterInvoke(InjectionPointData data) { super(data); }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean addInsn(InsnList insns, Collection<AbstractInsnNode> nodes, AbstractInsnNode insn) {
/* 78 */     MethodInsnNode methodNode = (MethodInsnNode)insn;
/* 79 */     if (Type.getReturnType(methodNode.desc) == Type.VOID_TYPE) {
/* 80 */       return false;
/*    */     }
/*    */     
/* 83 */     insn = InjectionPoint.nextNode(insns, insn);
/* 84 */     if (insn instanceof org.spongepowered.asm.lib.tree.VarInsnNode && insn.getOpcode() >= 54) {
/* 85 */       insn = InjectionPoint.nextNode(insns, insn);
/*    */     }
/*    */     
/* 88 */     nodes.add(insn);
/* 89 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\工程开发\Cracked\phosphor-1.12.2-0.2.6+build50-universal.jar!\org\spongepowered\asm\mixin\injection\points\AfterInvoke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */
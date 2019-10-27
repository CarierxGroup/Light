/*     */ package org.spongepowered.asm.lib.tree;
/*     */ 
/*     */ import java.util.Map;
/*     */ import org.spongepowered.asm.lib.MethodVisitor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FieldInsnNode
/*     */   extends AbstractInsnNode
/*     */ {
/*     */   public String owner;
/*     */   public String name;
/*     */   public String desc;
/*     */   
/*     */   public FieldInsnNode(int opcode, String owner, String name, String desc) {
/*  77 */     super(opcode);
/*  78 */     this.owner = owner;
/*  79 */     this.name = name;
/*  80 */     this.desc = desc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  91 */   public void setOpcode(int opcode) { this.opcode = opcode; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   public int getType() { return 4; }
/*     */ 
/*     */ 
/*     */   
/*     */   public void accept(MethodVisitor mv) {
/* 101 */     mv.visitFieldInsn(this.opcode, this.owner, this.name, this.desc);
/* 102 */     acceptAnnotations(mv);
/*     */   }
/*     */ 
/*     */   
/*     */   public AbstractInsnNode clone(Map<LabelNode, LabelNode> labels) {
/* 107 */     return (new FieldInsnNode(this.opcode, this.owner, this.name, this.desc))
/* 108 */       .cloneAnnotations(this);
/*     */   }
/*     */ }


/* Location:              D:\工程开发\Cracked\phosphor-1.12.2-0.2.6+build50-universal.jar!\org\spongepowered\asm\lib\tree\FieldInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.0.7
 */
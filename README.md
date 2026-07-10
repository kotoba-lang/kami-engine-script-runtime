# kotoba-lang/kami-engine-script-runtime

> **Archived scaffold (ADR-2607102200 addendum 8–9).**  
> This package is a clj-wgsl migration placeholder and is **not** the implementation SSoT.
> west group: `archived` (skipped by default `west update`).

## Where to go instead

| need | package |
|---|---|
| Browser WebGPU executor | `kotoba-lang/webgpu` |
| Game browser host (ECS/input/ui/audio) | `kotoba-lang/host` |
| Engine SDK (ECS/render-IR) | `kotoba-lang/kami-engine-sdk` |
| Input map | `kotoba-lang/kami-engine-input-map` |
| Domain IR (gpu/webgl/dance/…) | sibling `kotoba-lang/*` packages |

Do not add new code here.

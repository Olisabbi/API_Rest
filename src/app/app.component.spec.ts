import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { PaisesComponent} from './paises.component';

describe('AppComponent', () => {
  beforeEach(() => TestBed.configureTestingModule({
    imports: [RouterTestingModule],
    declarations: [PaisesComponent]
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(PaisesComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'front-paises'`, () => {
    const fixture = TestBed.createComponent(PaisesComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('front-paises');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(PaisesComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('.content span')?.textContent).toContain('front-paises app is running!');
  });
});
